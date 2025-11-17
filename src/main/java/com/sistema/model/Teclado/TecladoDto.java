package com.sistema.model.Teclado;

public class TecladoDto {
    private String nome;
    private String marca;
    private String tamanho;

    public TecladoDto(String nome, String marca, String tamanho) {
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
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
}
