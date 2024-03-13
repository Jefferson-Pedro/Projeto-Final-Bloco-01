package main;

import controller.CarroController;
import model.Carro;
import util.Cores;

import java.util.Scanner;

public class Menu {
      public static void main(String[] args) {

        CarroController controller = new CarroController();
        Scanner leia = new Scanner(System.in);

        int opcao;

        exibirMenu();

        while (true) {

            opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nSeu sonho do seu novo carro começa aqui!");
                System.out.println(Cores.TEXT_GREEN + "\nObrigado por usar este programa!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Cadastrar Novo Carro \n\n");
                    Carro carroCriado = controller.criar();
                    carroCriado.VisualizarCarro();
                    exibirMenu();
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todos os Carros \n\n");
                    controller.listar();
                    exibirMenu();
                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Buscar Carro por ID \n\n");

                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar Dados do Carro\n\n");
                    controller.atualizar();
                    exibirMenu();
                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar Carro\n\n");
                    controller.deletar();
                    exibirMenu();
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    exibirMenu();
                    break;
            }
        }
    }

    public static void exibirMenu(){
        System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
                + "*****************************************************");
        System.out.println("                                                     ");
        System.out.println("                LOCADORA MOTORISTA FELIZ             ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("            1 - Cadastrar Novo Carro                 ");
        System.out.println("            2 - Listar todos os Carros               ");
        System.out.println("            3 - Buscar Carro por ID                  ");
        System.out.println("            4 - Atualizar Dados do Carro             ");
        System.out.println("            5 - Apagar Carro                         ");
        System.out.println("            0 - Sair                                 ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.print("Entre com a opção desejada:");
        System.out.print("        " + Cores.TEXT_RESET);
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Jefferson Pedro");
        System.out.println("Generation Brasil - generation@generation.org");
        System.out.println("github.com/conteudoGeneration");
        System.out.println("*********************************************************");
    }
}
