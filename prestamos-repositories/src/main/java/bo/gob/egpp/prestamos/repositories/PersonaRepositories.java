package bo.gob.egpp.prestamos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import bo.gob.egpp.prestamos.model.Persona;

public interface PersonaRepositories extends JpaRepository<Persona, Integer> {

}
	