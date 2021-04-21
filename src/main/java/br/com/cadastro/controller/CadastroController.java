package br.com.cadastro.controller;

import br.com.cadastro.model.Endereco;
import br.com.cadastro.model.Usuario;
import br.com.cadastro.service.EnderecoService;
import br.com.cadastro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CadastroController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/usuario")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void criarUsuario (@RequestBody Usuario usuario) {
        usuarioService.criarUsuario(usuario);
    }

    @PostMapping("/usuario/{email}/endereco")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void criarEndereco (@PathVariable String email, @RequestBody Endereco endereco) {
        enderecoService.cadastrarEndereco(email,endereco);
    }

    @GetMapping ("/usuario/{email}")
    public Usuario retornaUsuario (@PathVariable String email) {
        return usuarioService.obterUsuario(email);
    }
}
