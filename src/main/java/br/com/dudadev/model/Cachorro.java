package br.com.dudadev.model;

public class Cachorro extends AnimalTerrestreAB{
    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer() {
        System.out.println("Quantidade de comida ingerida: 2-3% do peso corporal por dia");
    }

    @Override
    public void moverse() {
        System.out.println("Distância percorrida: 5-20 km por dia");
    }

    @Override
    public void dormir() {
        System.out.println("Horas de sono: 12-14 horas por dia");
    }
}
