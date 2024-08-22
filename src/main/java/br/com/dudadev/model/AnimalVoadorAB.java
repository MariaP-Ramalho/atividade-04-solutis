package br.com.dudadev.model;

public class AnimalVoadorAB extends AnimalAB{
    protected int quantidadeAssas;
    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeAssas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.quantidadeAssas = quantidadeAssas;
    }
}
