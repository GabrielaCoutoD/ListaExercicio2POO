package com.listasexercicio.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {
   public static void resolucao() {

       int num1;

        System.out.println("Escreva o número: ");
        Scanner scannernum1 = new Scanner(System.in);
        num1 = scannernum1.nextInt();

        System.out.println("Seu sucessor é: "+(num1 + 1));
        System.out.println("Seu antecessor é: "+(num1 - 1));

    }

}