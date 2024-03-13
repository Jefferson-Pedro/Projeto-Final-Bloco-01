package builder;

import model.CarroHatch;
import model.CarroSUV;

public class BuilderSUV {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int placa;
    private String tracao;

    public BuilderSUV id(int id) {
        this.id = id;
        return this;
    }

    public BuilderSUV marca(String marca) {
        this.marca = marca;
        return this;
    }

    public BuilderSUV modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public BuilderSUV cor(String cor) {
        this.cor = cor;
        return this;
    }

    public BuilderSUV placa(int placa) {
        this.placa = placa;
        return this;
    }

    public BuilderSUV lugares(String tracao) {
        this.tracao = tracao;
        return this;
    }
    public CarroSUV criaHatch (){
        return  new CarroSUV(id, marca, modelo, cor, placa, tracao);
    }
}
