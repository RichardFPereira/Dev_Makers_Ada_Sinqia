package br.com.ada.core.data.repositories;
import br.com.ada.core.data.entities.Gato;

public interface GatoRepository {

    public Gato findById(Integer id);
}
