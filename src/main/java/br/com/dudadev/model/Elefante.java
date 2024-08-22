package br.com.dudadev.model;

public class Elefante extends AnimalTerrestreAB{
    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer() {
        System.out.println("Quantidade de comida ingerida: 150 - 300 kg por dia");
    }

    @Override
    public void moverse() {
        System.out.println("Distância percorrida: 20-50 km por dia");
    }

    @Override
    public void dormir() {
        System.out.println("Horas de sono: 4-6 horas por dia");
    }
}
