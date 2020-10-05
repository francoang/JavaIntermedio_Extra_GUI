package capaNegocio;

import capaPersistencia.PersonaDAO;
import capaPersistencia.PersonaDAOFactory;
import entidades.Persona;

/**
 *
 * @author fnang
 */
public class GestorDePersonas {

    //Creamos una instancia de la interfaz DAO a traves del patron Factory.
    private static final PersonaDAOFactory factory = new PersonaDAOFactory();
    private static final PersonaDAO dao = factory.crearPersona();

    public void agregarPersona(Persona nuevaPersona) {
        if (nuevaPersona != null) {
            dao.agregar(nuevaPersona);
            //System.out.println("¡" + nuevaPersona.getNombreApellido() + " cargado con exito!");
        }
    }

    public Persona[] mostrarPersonas(){
        return dao.obtenerTodasPersonas();
    }
}
