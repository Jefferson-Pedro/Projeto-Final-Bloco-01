package builder;

import model.CarroHatch;

public class BuilderHatch {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int placa;
    private int lugares;

    public BuilderHatch id(int id) {
        this.id = id;
        return this;
    }

    public BuilderHatch marca(String marca) {
        this.marca = marca;
        return this;
    }

    public BuilderHatch modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public BuilderHatch cor(String cor) {
        this.cor = cor;
        return this;
    }

    public BuilderHatch placa(int placa) {
        this.placa = placa;
        return this;
    }

    public BuilderHatch lugares(int lugares) {
        this.lugares = lugares;
        return this;
    }
    public CarroHatch criaHatch (){
        return  new CarroHatch(id, marca, modelo, cor, placa, lugares);
    }
}
