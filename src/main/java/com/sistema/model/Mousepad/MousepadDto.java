package com.sistema.model.Mousepad;

public class MousepadDto {
    private String nome;
    private String marca;
    private double altura;
    private double comprimento;

    public MousepadDto(String nome, String marca, double altura, double comprimento) {
        this.nome = nome;
        this.marca = marca;
        this.altura = altura;
        this.comprimento = comprimento;
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
}
