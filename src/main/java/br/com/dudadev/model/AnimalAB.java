package br.com.dudadev.model;

import br.com.dudadev.service.AnimalIF;

public class AnimalAB implements AnimalIF {

    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private double peso;
    private double altura;

    public AnimalAB (String nome, String tipoAnimal, int idade, String habitat, double peso, double altura){
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
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

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Método comer não implementado.");
    }

    @Override
    public void moverse() {
        throw new UnsupportedOperationException("Método moverse não implementado.");
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Método dormir não implementado.");
    }
}
