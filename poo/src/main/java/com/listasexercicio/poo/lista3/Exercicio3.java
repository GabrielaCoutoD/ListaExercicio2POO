package com.listasexercicio.poo.lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {

        int numero1;
        int numero2;
        int maior;
        int menor;

        System.out.println("Digite um número: ");
        Scanner scannerleia = new Scanner(System.in);
        numero1 = scannerleia.nextInt();

        System.out.println("Digite um segundo número: ");
        numero2 = scannerleia.nextInt();

        maior = Math.max(numero1,numero2);
        menor = Math.min(numero1,numero2);

        System.out.println("O intervalo entre" + menor + "e" + maior + ":");

        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                
            }
            
        }
        
    }

}
