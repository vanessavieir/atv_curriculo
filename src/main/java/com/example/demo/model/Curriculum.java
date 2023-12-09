package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String titulo;
    private String endereco;
    private String telefone;
    private String email;
    private String objetivoProfissional;
    private String experiencia;
    private String educacao;
    private String habilidades;
    private String idiomas;

    public Curriculum() {
    }

    public Curriculum(String nome, String titulo, String endereco, String telefone, String email,
                      String objetivoProfissional, String experiencia, String educacao, String habilidades, String idiomas) {
        this.nome = nome;
        this.titulo = titulo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.objetivoProfissional = objetivoProfissional;
        this.experiencia = experiencia;
        this.educacao = educacao;
        this.habilidades = habilidades;
        this.idiomas = idiomas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObjetivoProfissional() {
        return objetivoProfissional;
    }

    public void setObjetivoProfissional(String objetivoProfissional) {
        this.objetivoProfissional = objetivoProfissional;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEducacao() {
        return educacao;
    }

    public void setEducacao(String educacao) {
        this.educacao = educacao;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
}
