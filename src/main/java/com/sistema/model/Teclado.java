package com.sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "teclado")
public class Teclado implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "tamanho", nullable = false)
    private String tamanho;

    public Teclado(String nome, String marca, String tamanho) {
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
    }
    public Teclado(){}
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Teclado{id=" + id + ", Nome='" + nome + "', Marca='" + marca + "Tamanho: " + tamanho + "'}";
    }
}
