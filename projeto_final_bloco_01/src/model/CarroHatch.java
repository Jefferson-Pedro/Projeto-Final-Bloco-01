package model;

public class CarroHatch extends Carro{

    private int lugares;

    public CarroHatch(int id, String marca, String modelo, String cor, int placa, int lugares) {
        super(id, marca, modelo, cor, placa);
        this.lugares = lugares;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    @Override
    public void VisualizarCarro() {
        super.VisualizarCarro();
        System.out.println("Tipo de carro: HATCH");
        System.out.println("Numero de lugares: " + this.lugares);
    }
}
