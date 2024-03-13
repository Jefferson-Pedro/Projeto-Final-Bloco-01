package repository;

import model.Carro;

public interface ICarroDAO {
    public Carro criar();
    public void atualizar();
    public void deletar();
    public void listar();
}
