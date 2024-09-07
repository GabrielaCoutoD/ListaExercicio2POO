package com.listasexercicio.poo.lista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao() {

        int altura;
        int largura;

        System.out.print("Digite a largura do retângulo: ");
        Scanner leia = new Scanner(System.in);
        largura = leia.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        altura = leia.nextInt();

        
        for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        
    }
}
