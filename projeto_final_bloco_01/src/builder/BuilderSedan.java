package builder;

import model.CarroHatch;
import model.CarroSedan;

public class BuilderSedan {

    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int placa;
    private int tamPortaMalas;

    public BuilderSedan id(int id) {
        this.id = id;
        return this;
    }

    public BuilderSedan marca(String marca) {
        this.marca = marca;
        return this;
    }

    public BuilderSedan modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public BuilderSedan cor(String cor) {
        this.cor = cor;
        return this;
    }

    public BuilderSedan placa(int placa) {
        this.placa = placa;
        return this;
    }

    public BuilderSedan tamPortaMalas(int tamPortaMalas) {
        this.tamPortaMalas = tamPortaMalas;
        return this;
    }
    public CarroSedan criaSedan (){
        return  new CarroSedan(id, marca, modelo, cor, placa, tamPortaMalas);
    }
}
