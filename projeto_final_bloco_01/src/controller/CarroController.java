package controller;

import builder.BuilderHatch;
import builder.BuilderSUV;
import builder.BuilderSedan;
import main.Menu;
import model.Carro;
import model.CarroHatch;
import model.CarroSUV;
import model.CarroSedan;
import repository.ICarroDAO;
import util.Cores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroController implements ICarroDAO {

    Scanner ler = new Scanner(System.in);
    List<CarroHatch> carroHatches = new ArrayList<CarroHatch>();
    List<CarroSedan> carroSedans = new ArrayList<CarroSedan>();
    List<CarroSUV> carroSUVS = new ArrayList<CarroSUV>();

    int id = 1;

    @Override
    public Carro criar() {
        System.out.println("*****************************************************");
        System.out.println(Cores.TEXT_WHITE +" Para começarmos, escolha o tipo de carro a ser cadastrado:");
        System.out.println(Cores.TEXT_BLUE + "\t\t\t1- Hatch \n \t\t\t2- Sedan \n \t\t\t3- SUV");
        System.out.print("Sua opção:");
        int opcao = ler.nextInt();


        if (opcao == 1){
            CarroHatch novoHatch = criaOuAtualizarHatch();
            carroHatches.add(novoHatch);
            System.out.println("Carro adicionado com sucesso!");
            return novoHatch;

        } else if (opcao == 2) {
          CarroSedan novoSedan = criaOuAtualizarSedan();
          carroSedans.add(novoSedan);
          System.out.println("Carro adicionado com sucesso!");
          return novoSedan;

        }else{
           CarroSUV novoSUV = criaOuAtualizarSUV();
           carroSUVS.add(novoSUV);
           System.out.println("Carro adicionado com sucesso!");
           return novoSUV;
        }
    }

    @Override
    public void atualizar() {
        System.out.println("*****************************************************");
        System.out.println(Cores.TEXT_WHITE +" Para começarmos, escolha o tipo de carro a ser modificado:");
        System.out.println(Cores.TEXT_BLUE + "\t\t\t1- Hatch \n \t\t\t2- Sedan \n \t\t\t3- SUV");
        System.out.print("Sua opção:");
        int num = ler.nextInt();

        if (num == 1){
            System.out.print(Cores.TEXT_WHITE +" Perfeito! Digite o ID do veiculo: ");
            num = ler.nextInt();
            for (int i = 0; i < carroHatches.size(); i++) {
                CarroHatch carroHatch = carroHatches.get(i);
                if (carroHatch.getId() == num) {
                    CarroHatch novoHatch = criaOuAtualizarHatch();
                    carroHatches.set(i, novoHatch);
                    System.out.println(novoHatch.toString());
                    System.out.println("Carro Hatch atualizado com sucesso!");
                    return;
                }
            }
            System.out.println("Carro Hatch não encontrado.");

            } else if (num == 2) {
                System.out.print(Cores.TEXT_WHITE +" Perfeito! Digite o ID do veiculo: ");
                num = ler.nextInt();
                for (int i = 0; i < carroHatches.size(); i++) {
                    CarroHatch carroHatch = carroHatches.get(i);
                    if (carroHatch.getId() == num) {
                        CarroHatch novoHatch = criaOuAtualizarHatch();
                        carroHatches.set(i, novoHatch);
                        System.out.println(novoHatch.toString());
                        System.out.println("Carro Sedan atualizado com sucesso!");
                        return;
                    }
                }
            System.out.println("Carro Sedan não encontrado.");

            }else if (num == 3) {
                System.out.print(Cores.TEXT_WHITE +" Perfeito! Digite o ID do veiculo: ");
                num = ler.nextInt();
                for (int i = 0; i < carroHatches.size(); i++) {
                    CarroHatch carroHatch = carroHatches.get(i);
                    if (carroHatch.getId() == num) {
                        CarroHatch novoHatch = criaOuAtualizarHatch();
                        carroHatches.set(i, novoHatch);
                        System.out.println(novoHatch.toString());
                        System.out.println("Carro SUV atualizado com sucesso!");
                        return;
                    }
                }
                System.out.println("Carro SUV não encontrado.");
        }
    }

    @Override
    public void deletar() {

        System.out.println("*****************************************************");
        System.out.println(Cores.TEXT_WHITE +" Para começarmos, escolha o tipo de carro a ser modificado:");
        System.out.println(Cores.TEXT_BLUE + "\t\t\t1- Hatch \n \t\t\t2- Sedan \n \t\t\t3- SUV");
        System.out.print("Sua opção:");
        int num = ler.nextInt();

        if (num == 1){
            for (int i = 0; i < carroHatches.size(); i++) {
                Carro carro = carroHatches.get(i);
                if (carro.getId() == id) {
                    carroHatches.remove(i);
                    System.out.println("Carro deletado com sucesso!");
                    return;
                }
            }
            System.out.println("Carro não encontrado.");

        } else if (num == 2) {
            for (int i = 0; i < carroSedans.size(); i++) {
                Carro carro = carroSedans.get(i);
                if (carro.getId() == id) {
                    carroSedans.remove(i);
                    System.out.println("Carro deletado com sucesso!");
                    return;
                }
            }
            System.out.println("Carro não encontrado.");

        } else if (num == 3) {
            for (int i = 0; i < carroSUVS.size(); i++) {
                Carro carro = carroSUVS.get(i);
                if (carro.getId() == id) {
                    carroSUVS.remove(i);
                    System.out.println("Carro deletado com sucesso!");
                    return;
                }
            }
        }
    }

    @Override
    public void listar() {
        System.out.println("************************ HATCHS *****************************");
        carroHatches.forEach(System.out::println);
        System.out.println("************************ SEDAN *****************************");
        carroSedans.forEach(System.out::println);
        System.out.println("************************ SUV *****************************");
        carroSUVS.stream().forEach(System.out::println);
    }

    @Override
    public void buscarPorId() {

    }

    private CarroHatch criaOuAtualizarHatch(){

        System.out.println("Digite as informações do veiculo:");
        System.out.print("Marca:");
        String marca = ler.next();
        System.out.print("Modelo:");
        String modelo = ler.next();
        System.out.print("Cor:");
        String cor = ler.next();
        System.out.print("Quantidade de Lugares:");
        int lugares = ler.nextInt();
        System.out.print("Placa:");
        int placa = ler.nextInt();

        try {
        CarroHatch novoHatch = new BuilderHatch()
                .id(id++)
                .marca(marca)
                .modelo(modelo)
                .cor(cor)
                .lugares(lugares)
                .placa(placa)
                .criaHatch();

        return novoHatch;

        }catch (Exception e){
            System.out.println("Ocorreu um erro ao criar o Hatch.");
        }
        return null;
    }

    private CarroSedan criaOuAtualizarSedan(){

        System.out.println("Digite as informações do veiculo:");
        System.out.print("Marca:");
        String marca = ler.next();
        System.out.print("Modelo:");
        String modelo = ler.next();
        System.out.print("Cor:");
        String cor = ler.next();
        System.out.print("Quantidade de Lugares:");
        int tamPortaMalas = ler.nextInt();
        System.out.print("Placa:");
        int placa = ler.nextInt();

        try {
            CarroSedan novoSedan = new BuilderSedan()
                    .id(id++)
                    .marca(marca)
                    .modelo(modelo)
                    .cor(cor)
                    .placa(placa)
                    .tamPortaMalas(tamPortaMalas)
                    .criaSedan();

            return novoSedan;

        }catch (Exception e){
            System.out.println("Ocorreu um erro ao criar o Sedan.");
        }
        return null;
    }

    private CarroSUV criaOuAtualizarSUV(){

        System.out.println("Digite as informações do veiculo:");
        System.out.print("Marca:");
        String marca = ler.next();
        System.out.print("Modelo:");
        String modelo = ler.next();
        System.out.print("Cor:");
        String cor = ler.next();
        System.out.print("Quantidade de Lugares:");
        String tracao = ler.nextLine();
        System.out.print("Placa:");
        int placa = ler.nextInt();

        try {
            CarroSUV novoSUV = new BuilderSUV()
                    .id(id++)
                    .marca("Renault")
                    .modelo("Duster")
                    .cor("Cinza")
                    .placa(789456)
                    .tracao("4x2")
                    .criaSUV();

            return novoSUV;

        } catch (Exception e){
        System.out.println("Ocorreu um erro ao criar o SUV.");
        }
        return null;
    }
}
