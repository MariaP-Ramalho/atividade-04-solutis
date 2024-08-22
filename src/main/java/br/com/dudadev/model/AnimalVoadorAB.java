package br.com.dudadev.model;

public class AnimalVoadorAB extends AnimalAB{
    protected int quantidadeAsas;
    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeAsas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.quantidadeAsas = quantidadeAsas;
    }
}
