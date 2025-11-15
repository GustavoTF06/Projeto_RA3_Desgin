package com.sistema.model.Cadeira;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cadeira")

public class Cadeira implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "altura", nullable = false)
    private double altura;

    public Cadeira(String nome, String marca, double altura) {
        this.nome = nome;
        this.marca = marca;
        this.altura = altura;
    }

    public Cadeira(){}

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

    @Override
    public String toString() {
        return "Cadeira{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", altura=" + altura +
                '}';
    }
}
