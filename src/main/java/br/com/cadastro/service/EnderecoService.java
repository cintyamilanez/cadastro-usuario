package br.com.cadastro.service;

import br.com.cadastro.model.Endereco;
import br.com.cadastro.model.Usuario;
import br.com.cadastro.repository.EnderecoRepository;
import br.com.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private UsuarioService usuarioService;

    public void cadastrarEndereco(String email, Endereco endereco) {

        Usuario usuario = usuarioService.obterUsuario(email);
        endereco.setUsuario(usuario);
        enderecoRepository.save(endereco);
    }
}
