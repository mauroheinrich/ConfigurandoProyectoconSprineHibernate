
package ar.com.mauroheinrich.pruebaJPA_MariaDB.repository;

import ar.com.mauroheinrich.pruebaJPA_MariaDB.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
    
    
}
