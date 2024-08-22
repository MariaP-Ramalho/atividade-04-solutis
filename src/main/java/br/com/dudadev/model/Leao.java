package br.com.dudadev.model;

public class Leao extends AnimalTerrestreAB{
    public Leao(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, quantidadeDePatas);
    }

    @Override
    public void comer() {
        System.out.println("Quantidade de comida ingerida: 5-7 kg por dia");
    }

    @Override
    public void moverse() {
        System.out.println("Distância percorrida: 5-10 km por dia");
    }

    @Override
    public void dormir() {
        System.out.println("Horas de sono: 16-20 horas por dia");
    }
}
