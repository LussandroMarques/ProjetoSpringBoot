package edu.senacrs.entity;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    // Comentada validação de CPF enquanto em teste
    //@CPF
    @Column(name="cpf", unique = true)
    private String cpf;

    @Column(name="nome", nullable=false)
    private String nome;

    @Column(name="matricula", nullable=false, unique=true)
    private String matricula;

    @Column(name="curso", nullable=false)
    private String curso;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}