package br.com.dudadev.model;

public class AnimalMarinhoAB extends AnimalAB{
    protected double envergaduraAssa;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.envergaduraAssa = envergaduraAssa;
    }
}
