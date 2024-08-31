package com.desvioscondicionais.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {

        int n;

        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
       
        if ( n == 0 ) {
            System.out.println("Esse número é zero.");
       
        } else if (n % 2 == 0 ) {
           System.out.println("Esse número é par.");
       }
       else {
           System.out.println("Esse número é ímpar.");
       
       }
       
        
           }
       }
