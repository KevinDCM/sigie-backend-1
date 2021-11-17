package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPerfilEntradaRepository extends JpaRepository<TipoPerfilEntrada, Integer> {
}
