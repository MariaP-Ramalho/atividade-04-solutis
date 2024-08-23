package br.com.dudadev.model;

public class AnimalVoadorAB extends AnimalAB{
    private int quantidadeAsas;
    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeAsas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.quantidadeAsas = quantidadeAsas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }
}
