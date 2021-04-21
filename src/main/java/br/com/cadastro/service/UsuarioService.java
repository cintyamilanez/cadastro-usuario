package br.com.cadastro.service;

import br.com.cadastro.model.Usuario;
import br.com.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void criarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario obterUsuario(String email) {
        Optional<Usuario> opcional = usuarioRepository.findById(email);

        if(!opcional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!");
        }

        return opcional.get();
    }
}
