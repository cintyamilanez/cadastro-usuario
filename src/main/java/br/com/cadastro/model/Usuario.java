package br.com.cadastro.model;

import java.util.Date;
import java.util.List;

public class Usuario {

    private String nome;
    private String email;
    private String CPF;
    private Date nascimento;
    private List<Endereco> endereco;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
