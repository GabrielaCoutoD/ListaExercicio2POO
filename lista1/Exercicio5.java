package com.listasexercicio.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {

        double comprimento;
        double largura;
        double area;
        double precoMetroQuadrado;
        double preco;

        System.out.println("Escreva o comprimento: ");
        Scanner scannerleia = new Scanner(System.in);
        comprimento = scannerleia.nextDouble();

        System.out.println("Escreva a largura: ");
        largura = scannerleia.nextDouble();

        area = largura * comprimento;

        System.out.println("Escreva o preço por metro quadrado: ");
        precoMetroQuadrado = scannerleia.nextDouble();

        preco = precoMetroQuadrado * area;
        System.out.println("O valor do terreno é: R$ " + preco);



    }
}
