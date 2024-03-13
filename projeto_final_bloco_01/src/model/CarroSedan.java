package model;

public class CarroSedan extends Carro{

    private int tamPortaMalas;

    public CarroSedan(int id, String marca, String modelo, String cor, int placa, int tamPortaMalas) {
        super(id, marca, modelo, cor, placa);
        this.tamPortaMalas = tamPortaMalas;
    }
}
