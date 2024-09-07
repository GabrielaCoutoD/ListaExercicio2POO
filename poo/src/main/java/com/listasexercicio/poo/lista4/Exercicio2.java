package com.listasexercicio.poo.lista4;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {

        int numVendas;

        System.out.print("Digite o número de vendas do dia: ");
        Scanner scanner = new Scanner(System.in);
        numVendas = scanner.nextInt();

        double[] vendas = new double[numVendas];

        for (int i = 0; i < numVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }

        double menorValor = vendas[0];
        double maiorValor = vendas[0];

        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] < menorValor) {
                menorValor = vendas[i];
            }
            if (vendas[i] > maiorValor) {
                maiorValor = vendas[i];
            }
        }

        
        System.out.printf("O menor valor de venda do dia é: %.2f\n", menorValor);
        System.out.printf("O maior valor de venda do dia é: %.2f\n", maiorValor);

        
    }
}
