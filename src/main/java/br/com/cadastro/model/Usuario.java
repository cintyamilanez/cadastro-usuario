package br.com.cadastro.model;

import java.util.Date;

public class Usuario {

    private String nome;
    private String email;
    private String CPF;
    private Date nascimento;

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
}
