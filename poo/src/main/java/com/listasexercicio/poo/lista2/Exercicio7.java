package com.listasexercicio.poo.lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {

        int divisor, numero;

        System.out.println("Digite um número: ");
        Scanner scannernum = new Scanner(System.in);
        numero = scannernum.nextInt();

        System.out.println("Digite um número: ");
        divisor = scannernum.nextInt();

        if (divisor==0) {
            System.out.println("Divisor não pode ser zero");
            
        } else {

            if (numero % divisor==0) {
                System.out.println(numero + " é divisível por " + divisor);
                
            } else {
                System.out.println(numero + " não é divisível por " + divisor);
                
            }
            
        }
        
    }

}
