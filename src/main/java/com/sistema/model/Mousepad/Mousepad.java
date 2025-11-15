package com.sistema.model.Mousepad;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mousepad")

public class Mousepad implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "altura", nullable = false)
    private double altura;

    @Column(name = "comprimento", nullable = false)
    private double comprimento;

    public Mousepad(String nome, String marca, double altura, double comprimento) {
        this.nome = nome;
        this.marca = marca;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public Mousepad(){}

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Mousepad{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", altura=" + altura +
                ", comprimento=" + comprimento +
                '}';
    }
}
