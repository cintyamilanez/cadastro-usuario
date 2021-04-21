package br.com.cadastro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Column
    private String nome;

    @Id
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String CPF;

    @Column
    @Temporal(TemporalType.DATE)
    private Date nascimento;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario")
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
