package br.com.dudadev.model;

import br.com.dudadev.service.AnimalIF;

public class AnimalAB implements AnimalIF {

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double peso;
    protected double altura;

    public AnimalAB (String nome, String tipoAnimal, int idade, String habitat, double peso, double altura){
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
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
