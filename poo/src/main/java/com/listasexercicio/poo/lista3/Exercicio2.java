package com.listasexercicio.poo.lista3;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {

        int numero = 0;

        System.out.println("Digite um número: ");
        Scanner scannernum = new Scanner(System.in);
        numero = scannernum.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + numero + "=" + (i*numero));
            
        }
        
    }

}
