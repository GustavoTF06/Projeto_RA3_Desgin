package com.sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mouse")
public class Mouse implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "marca", nullable = false, unique = true)
    private String marca;

    @Column(name = "cor", nullable = false)
    private String cor;

    public Mouse(String nome, String marca, String cor){
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
    }
    public Mouse(){}
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Mouse{id=" + id + ", nome='" + nome + "', marca='" + marca + "Cor: " + cor + "'}";
    }
}
