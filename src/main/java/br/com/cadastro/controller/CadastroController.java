package br.com.cadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {

    //TODO: Precisa receber um usuario no formato json
    @PostMapping("/usuario")
    public void criarUsuario () {

    }

    //TODO: Precisa receber um endereco no formato json e associar a um usuario
    @PostMapping("/usuario/{email}/endereco")
    public void criarEndereco () {

    }

    //TODO: Preciso retornar um usuario e seus enderecos
    @GetMapping ("/usuario/{email}")
    public void retornaUsuario () {

    }
}
