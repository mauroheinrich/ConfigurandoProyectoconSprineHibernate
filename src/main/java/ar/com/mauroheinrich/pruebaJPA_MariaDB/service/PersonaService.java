
package ar.com.mauroheinrich.pruebaJPA_MariaDB.service;

import ar.com.mauroheinrich.pruebaJPA_MariaDB.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private IPersonaRepository persoRepo;
    
    
}
