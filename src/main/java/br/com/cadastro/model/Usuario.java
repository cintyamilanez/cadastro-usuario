package br.com.cadastro.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Column(nullable = false)
    private String nome;

    @Id
    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String CPF;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date nascimento;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
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
