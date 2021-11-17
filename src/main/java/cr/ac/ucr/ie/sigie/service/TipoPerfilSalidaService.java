package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.TipoPerfilSalida;
import cr.ac.ucr.ie.sigie.repository.TipoPerfilSalidaRepository;

import java.util.List;

@Service
@Transactional
public class TipoPerfilSalidaService {

    @Autowired
    private TipoPerfilSalidaRepository repository;

    public List<TipoPerfilSalida> listAll() {
        return repository.findAll();
    }

    public void save(TipoPerfilSalida tipoPerfilSalida) {
        repository.save(tipoPerfilSalida);
    }

    public TipoPerfilSalida get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
