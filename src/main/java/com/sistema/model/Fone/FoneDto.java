package com.sistema.model.Fone;

public class FoneDto {

    private String nome;
    private String marca;
    private boolean microfone;

    public FoneDto(String nome, String marca, boolean microfone) {
        this.nome = nome;
        this.marca = marca;
        this.microfone = microfone;
    }

    public FoneDto() {}

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
}