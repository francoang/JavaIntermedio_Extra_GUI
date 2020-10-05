package capaPresentacion;

import capaNegocio.GestorDePersonas;
import entidades.Doctor;
import entidades.Paciente;
import entidades.Persona;

/**
 *
 * @author fnang
 */
public class Principal {

    private static final GestorDePersonas gestor = new GestorDePersonas();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        cargarPersona();
        
        mostrarListado();
    }

    public static void mostrarListado() {
        System.out.println("___Listado___");
        Persona[] personas = gestor.mostrarPersonas();
        for (Persona persona : personas) {
            System.out.println(persona + "\n");
        }
        System.out.println("_____________");
    }

    public static void cargarPersona() {
        System.out.println("Ingrese el documento: ");
        int documento = Consola.readInt();

        System.out.println("Ingrese nombre y apellido: ");
        String nomApe = Consola.readLine();

        System.out.println("¿Es un (P)aciente o un (D)octor?");
        String letra = Consola.readLine();
        switch (letra.toUpperCase()) {
            case "P":
                System.out.println("Ingrese el nro. de obra social: ");
                int obraSocial = Consola.readInt();
                Persona paciente = new Paciente(obraSocial, documento, nomApe);
                gestor.agregarPersona(paciente);
                break;
            case "D":
                System.out.println("Ingrese la matricula: ");
                int mat = Consola.readInt();
                Persona doctor = new Doctor(mat, documento, nomApe);
                gestor.agregarPersona(doctor);
                break;
            default:
                System.out.println("ERROR. Por favor, cargue correctamente los datos.");
        }
    }
}
