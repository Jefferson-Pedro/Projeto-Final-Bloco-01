package model;

public class CarroSedan extends Carro{

    private int tamPortaMalas;

    public CarroSedan(int id, String marca, String modelo, String cor, int placa, int tamPortaMalas) {
        super(id, marca, modelo, cor, placa);
        this.tamPortaMalas = tamPortaMalas;
    }

    public int getTamPortaMalas() {
        return tamPortaMalas;
    }

    public void setTamPortaMalas(int tamPortaMalas) {
        this.tamPortaMalas = tamPortaMalas;
    }

    @Override
    public void VisualizarCarro() {
        super.VisualizarCarro();
        System.out.println("Tipo de carro: SEDAN");
        System.out.println("Tamanho do porta malas: " + this.tamPortaMalas);
    }
}
