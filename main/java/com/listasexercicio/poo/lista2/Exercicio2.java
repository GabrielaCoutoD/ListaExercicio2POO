package com.listasexercicio.poo.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {

        int n1, n2;

    System.out.println("Digite um Nº: ");
    Scanner scanner = new Scanner(System.in);
    n1 = scanner.nextInt();

    System.out.println("Digite o segundo Nº: ");
    n2 = scanner.nextInt();

    if (n1 > n2) {
        System.out.println("O " +n1+" é maior que: "+n2);

    } else if (n1 < n2){
        System.out.println("O " +n1+" é menor que: "+n2);
    }

    else{
        System.out.println("Os Nº são iguais.");
    }



    }



}