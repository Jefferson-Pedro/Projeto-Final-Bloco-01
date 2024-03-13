package model;

public class CarroSUV extends Carro{
    private String tracao;
    public CarroSUV(int id, String marca, String modelo, String cor, int placa, String tracao) {
        super(id, marca, modelo, cor, placa);
        this.tracao = tracao;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public void VisualizarCarro() {
        super.VisualizarCarro();
        System.out.println("Tipo de carro: SUV");
        System.out.println("Tipo de tração: " + this.tracao);
    }
}
