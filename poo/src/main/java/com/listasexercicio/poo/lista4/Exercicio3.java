package com.listasexercicio.poo.lista4;
import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {

    
        int numVendas;

        System.out.print("Digite o número de vendas do dia: ");
        Scanner scanner = new Scanner(System.in);
        numVendas = scanner.nextInt();

       double[] vendas = new double[numVendas];

        double somaVendas = 0;

        for (int i = 0; i < numVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
            somaVendas += vendas[i];
        }

        double ticketMedio = somaVendas / numVendas;

        System.out.printf("O ticket médio das vendas do dia é: %.2f\n", ticketMedio);

        
    }
}
