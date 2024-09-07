package com.listasexercicio.poo.lista3;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() throws InterruptedException {

        int segundos = 0;

        Scanner scanner = new Scanner(System.in);
    

     do { 
          System.out.println("Digite um nº entre 1 e 59: ");
        segundos = scanner.nextInt();
           
        if (segundos < 1 || segundos > 59) {
            System.out.print("Você digitou o nº errado.\n");
        }
        
    } while (segundos < 1 || segundos > 59);
    
            
        System.out.println("Iniciando cronometro de " + segundos + " segundos");
    
            
        for (int i = 0; i <= segundos;i++) {
            System.out.println(i+" Segundos");
    
            
            Thread.sleep(1000);
        }

        System.out.println("Tempo esgotado!");
    
    
       }
    
    }
