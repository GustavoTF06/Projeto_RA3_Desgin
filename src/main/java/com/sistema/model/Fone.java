package com.sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "teclado")

public class Fone implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "microfone", nullable = false)
    private boolean microfone;

    public Fone(String nome, String marca, boolean microfone) {
        this.nome = nome;
        this.marca = marca;
        this.microfone = microfone;
    }
    public  Fone(){}
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

    public boolean isMicrofone() {
        return microfone;
    }

    public void setMicrofone(boolean microfone) {
        this.microfone = microfone;
    }

    @Override
    public String toString() {
        return "Fone{id=" + id + ", Nome='" + nome + "', Marca='" + marca + "Microfone: " + microfone + "'}";
    }
}
