package br.com.dudadev.model;

public class Peixe extends AnimalMarinhoAB{
    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, envergaduraAssa);
    }

    @Override
    public void comer() {
        System.out.println("Quantidade de comida ingerida: 1-2% do peso corporal por dia");
    }

    @Override
    public void moverse() {
        System.out.println("Distância percorrida: 1-2 km por dia");
    }

    @Override
    public void dormir() {
        System.out.println("Horas de sono: 4-8 horas por dia");
    }
}
