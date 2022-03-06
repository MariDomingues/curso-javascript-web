package com.nutricao.model.request;

public class PacienteRequest {

    private String nome;
    private double peso;
    private double altura;
    private double gorduraCorporal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getGorduraCorporal() {
        return gorduraCorporal;
    }

    public void setGorduraCorporal(double gorduraCorporal) {
        this.gorduraCorporal = gorduraCorporal;
    }
}
