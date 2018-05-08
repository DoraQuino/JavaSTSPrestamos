package bo.gob.egpp.prestamos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import bo.gob.egpp.prestamos.model.Pagos;

public interface PagosRepository extends JpaRepository<Pagos, Integer> {

}
