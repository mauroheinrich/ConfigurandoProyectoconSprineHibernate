
package ar.com.mauroheinrich.pruebaJPA_MariaDB.service;

import ar.com.mauroheinrich.pruebaJPA_MariaDB.model.Persona;
import java.util.List;


public interface IPersonaService {
      //metodo para traer a todas las personas
    public List<Persona> getPersonas();
    
    //alta
    public void savePersona(Persona perso);
    
    //baja
    public void deletePersona (Long id);
    
    //lectura un solo objeto
    public Persona findPersona(Long id);
    
    //edicion modificacion
}
