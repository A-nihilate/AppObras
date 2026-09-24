package br.dev.annihilate.appobras;

import java.util.ArrayList;
import java.util.List;
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

//        dados:
        System.out.println("Dados da Obra");
        
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
                System.out.println("========================");
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

//        output
        System.out.println("Informacoes da obra:");

        System.out.println(obraA.toString());

        System.out.println("informacoes dos Comodos");

        for (Comodo AtualComodo : obraA.listaComodos) {

            System.out.println(AtualComodo.toString());

        }

    }
}
