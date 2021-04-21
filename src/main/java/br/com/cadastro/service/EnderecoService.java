package br.com.cadastro.service;

import br.com.cadastro.model.Endereco;
import br.com.cadastro.model.Usuario;
import br.com.cadastro.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private UsuarioService usuarioService;

    public void cadastrarEndereco(String email, Endereco endereco) {

        Usuario usuario = usuarioService.obterUsuario(email);
        endereco.setUsuario(usuario);

        try {
            enderecoRepository.save(endereco);
        } catch (Exception e) {

            String nomeClasse = e.getClass().getName();
            if(
                    nomeClasse.equals("org.springframework.dao.DataIntegrityViolationException") ||
                            nomeClasse.equals("org.springframework.orm.jpa.JpaSystemException")
            ) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Favor informar os dados corretamente!");
            } else {
                throw e;
            }
        }
    }
}
