package capaPersistencia;

/**
 *
 * @author fnang
 */
public class PersonaDAOFactory {
    
    public PersonaDAO crearPersona(){
        return new PersonaDAOenArrayList();
    }
}
