package br.com.cadastro.repository;

import br.com.cadastro.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco,Integer> {
}
