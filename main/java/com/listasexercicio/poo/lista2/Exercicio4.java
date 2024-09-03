package com.listasexercicio.poo.lista2;

import java.util.Scanner;


public class Exercicio4 {
    public static void resolucao() {

        int idade;

        System.out.println("Quantos anos você tem? ");
        Scanner scanneridade = new Scanner(System.in);
        idade = scanneridade.nextInt();

        if (idade < 16) {
            System.out.println("Não pode entrar no evento.");

        } else if(idade >= 16 && idade <= 18) { 
            System.out.println("Entre somente acompanhado pelos responsáveus.");
            
        }else { System.out.println("Entrada liberada.");

            
        }
        
    }

}
