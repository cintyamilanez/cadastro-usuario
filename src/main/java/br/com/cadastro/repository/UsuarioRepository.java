package br.com.cadastro.repository;

import br.com.cadastro.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario,String> {

}
