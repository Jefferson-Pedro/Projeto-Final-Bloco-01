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

    @Override
    public Carro criar() {
        System.out.println("*****************************************************");
        System.out.println(Cores.TEXT_WHITE +" Para começarmos, escolha o tipo de carro a ser cadastrado:");
        System.out.println(Cores.TEXT_BLUE + "\t\t\t1- Hatch \n \t\t\t2- Sedan \n \t\t\t3- SUV");
        System.out.print("Sua opção:");
        int opcao = ler.nextInt();
        int id = 0;

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

    }

    @Override
    public void deletar() {

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

    private CarroHatch criaOuAtualizarHatch(){
        int id = 0;
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
        int id = 0;
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
        int id = 0;
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
