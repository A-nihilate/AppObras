package br.dev.annihilate.appobras;

import java.util.Scanner;

/**
 *
 * @author sesi2dia
 */
public class AppObras {

    public static void main(String[] args) {

        Scanner scannerTexto = new Scanner(System.in);
        Scanner scannerNumero = new Scanner(System.in);
        int comodosRegistrados = 0;
        Obra obraA = new Obra();
        int state = 0;
        boolean active = true;
//        dados:



         System.out.println("Cadastro da Obra");

            System.out.println("========================");
            System.out.println("Insira os dados requisitados");
            System.out.println("========================");

            System.out.print("Proprietario: ");
            obraA.proprietario = scannerTexto.nextLine();
            System.out.println("===");

            System.out.print("Cidade: ");
            obraA.cidade = scannerTexto.nextLine();
            System.out.println("===");

            System.out.print("Local: ");
            obraA.local = scannerTexto.nextLine();
            System.out.println("===");

            System.out.println("Uf: ");
            obraA.uf = scannerTexto.nextLine();
            System.out.println("========================");

            
        while (active) {
            System.out.println("1 Cadastro de comodos \n 2 Exibição \n 0 Sair");
            state = scannerNumero.nextInt();

            
           
            switch (state) {

                case 0:
                    active = false;
                    break;

                case 1:

//        comodos
                    System.out.printf("\n\nDados dos Comodos da obra \n========================\n ");

                    while (true) {

                        Comodo novoComodo = new Comodo();
                        ++comodosRegistrados;

                        System.out.printf("Comodo %d\n------\n", comodosRegistrados);

                        System.out.print("nome: ");
                        novoComodo.nome = scannerTexto.nextLine();
                        System.out.println("===");
                        if (novoComodo.nome.isBlank()) {
                            System.out.println("abortado");
                            System.out.println("=".repeat(30));
                            --comodosRegistrados;
                            break;
                        }

                        System.out.print("largura: ");
                        novoComodo.largura = scannerNumero.nextDouble();
                        System.out.println("===");

                        System.out.print("comprimento: ");
                        novoComodo.comprimento = scannerNumero.nextDouble();
                        System.out.println("========================");

                        obraA.listaComodos.add(novoComodo);

                        System.out.printf("\n\n");

                    }
                    break;

//        output
                case 2:

                    System.out.println("\n==========\nInformacoes da obra:\n==========\n");

                    System.out.println(obraA.toString());

                    System.out.println("\n==========\ninformacoes dos Comodos\n==========\n");

                    if (obraA.listaComodos.isEmpty()) {
                        System.out.println("List is Empty\n");
                        break;
                    }

                    for (Comodo AtualComodo : obraA.listaComodos) {

                        System.out.println(AtualComodo.toString());
                        
                    }
                    break;

                default:
                    System.out.println("\n--\nplease, input another number.\n---");
                    break;
            }
        }
    }
}
