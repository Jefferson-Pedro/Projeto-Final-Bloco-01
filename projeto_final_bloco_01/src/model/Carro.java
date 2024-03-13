package model;

public abstract class Carro {

    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private int placa;

    public Carro(int id, String marca, String modelo, String cor, int placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void VisualizarCarro(){

        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do novo Carro:");
        System.out.println("***********************************************************");
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
    }
}
