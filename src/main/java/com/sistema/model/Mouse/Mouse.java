package com.sistema.model.Mouse;

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

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "cor", nullable = false)
    private String cor;

    public Mouse(MouseDto MouseDto) {
        this.nome = MouseDto.getNome();
        this.marca = MouseDto.getMarca();
        this.cor = MouseDto.getCor();
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
        return "Mouse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
