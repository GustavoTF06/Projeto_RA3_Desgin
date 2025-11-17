package com.sistema.model.Notebook;

public class NotebookDto {
    private String nome;
    private String processor;
    private String memoriaRam;
    private String  memoria;

    public NotebookDto(String nome, String processor, String memoriaRam, String memoria) {
        this.nome = nome;
        this.processor = processor;
        this.memoriaRam = memoriaRam;
        this.memoria = memoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
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
}
