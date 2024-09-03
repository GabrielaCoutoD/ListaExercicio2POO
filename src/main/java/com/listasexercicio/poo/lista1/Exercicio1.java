package com.listasexercicio.poo.lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {

        int num1;
        int num2;
 
         System.out.println("Digite o primeiro número: ");
         Scanner scannernum = new Scanner(System.in);
         num1 = scannernum.nextInt();
 
 
         System.out.println("Digite o segundo número: ");
         num2 = scannernum.nextInt();
 
         System.out.println("O resultado da soma é: " + (num1+num2));
 
 
}

}
