package br.com.dudadev.model;

public class AnimalMarinhoAB extends AnimalAB{
    private double envergaduraAssa;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.envergaduraAssa = envergaduraAssa;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    public void setEnvergaduraAssa(double envergaduraAssa) {
        this.envergaduraAssa = envergaduraAssa;
    }
}
