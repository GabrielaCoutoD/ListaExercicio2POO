package com.listasexercicio.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {

        String nome;
        String sobrenome;

        System.out.println("Digite seu  nome: ");
        Scanner scannernome = new Scanner(System.in);
        nome = scannernome.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scannernome.nextLine();

        System.out.print("Olá " + nome + sobrenome);

        
    }

}

