package main;

import util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {

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
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada:                            ");
            System.out.print("                                   " + Cores.TEXT_RESET);

            opcao = leia.nextInt();

            if (opcao == 6) {
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nSeu sonho do seu novo carro começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Cadastrar Novo Carro \n\n");
                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todos os Carros \n\n");

                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Buscar Carro por ID \n\n");

                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar Dados do Carro\n\n");

                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar Carro\n\n");

                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Jefferson Pedro");
        System.out.println("Generation Brasil - generation@generation.org");
        System.out.println("github.com/conteudoGeneration");
        System.out.println("*********************************************************");
    }
}
