package br.com.dudadev.model;

public class AnimalTerrestreAB extends AnimalAB{

    private int quantidadeDePatas;
    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }
}
