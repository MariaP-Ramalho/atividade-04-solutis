package br.com.dudadev.model;

public class Pombo extends AnimalVoadorAB{
    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeAssas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, quantidadeAssas);
    }

    @Override
    public void comer() {
        System.out.println("Quantidade de comida ingerida: 60 - 100 gramas por dia");
    }

    @Override
    public void moverse() {
        System.out.println("Distância percorrida: até 80 km por dia");
    }

    @Override
    public void dormir() {
        System.out.println("Horas de sono: 10-12 horas por dia");
    }
}
