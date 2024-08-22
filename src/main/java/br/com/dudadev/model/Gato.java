package br.com.dudadev.model;

public class Gato extends AnimalTerrestreAB{
    public Gato(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer() {
        System.out.println("Quantidade de comida ingerida: 2-4% do peso corporal por dia");
    }

    @Override
    public void moverse() {
        System.out.println("Distância percorrida: 2-5 km por dia");
    }

    @Override
    public void dormir() {
        System.out.println("Horas de sono: 12-16 horas por dia");
    }
}
