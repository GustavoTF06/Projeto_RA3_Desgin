package com.sistema.model.Cadeira;

public class CadeiraDto {

    private String nome;
    private String marca;
    private double altura;

    public CadeiraDto(String nome, String marca, double altura) {
        this.nome = nome;
        this.marca = marca;
        this.altura = altura;
    }

    public CadeiraDto() {}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}
