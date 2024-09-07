package com.listasexercicio.poo.lista4;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {

        int numeroVenda;

        System.out.print("Digite o número de vendas do dia: ");
        Scanner scanner = new Scanner(System.in);
        numeroVenda = scanner.nextInt();

        double[] vendas = new double[numeroVenda];

        for (int i = 0; i < numeroVenda; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }

        double somaVendas = 0;

        for (int i = 0; i < vendas.length; i++) {
            somaVendas += vendas[i];
        }

        System.out.printf("A soma total das vendas do dia é: %.2f\n", somaVendas);

    }
}
