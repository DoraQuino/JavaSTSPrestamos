package bo.gob.egpp.prestamos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import bo.gob.egpp.prestamos.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

}
