package com.sistema.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "notebook")

public class Notebook implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "processador", nullable = false)
    private String processador;

    @Column(name = "memoriaRam", nullable = false)
    private String memoriaRam;

    @Column(name = "memoria", nullable = false)
    private String memoria;

    public Notebook(String nome, String processador, String memoriaRam, String memoria) {
        this.nome = nome;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.memoria = memoria;
    }
    public Notebook(){}

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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }



    @Override
    public String toString(){
        return "Notebook{id= "+ id + ", nome: " + nome + ", processador" + processador + ", memoria Ram: " + memoriaRam + ",memoria: " + memoria + "}";
    }
}
