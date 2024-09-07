package com.listasexercicio.poo.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
     

        System.out.print("Digite o número de andares da pirâmide: ");
        Scanner scanner = new Scanner(System.in);
        int andares = scanner.nextInt();

        for (int i = 1; i <= andares; i++) {

            for (int j = andares - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
    }
}
