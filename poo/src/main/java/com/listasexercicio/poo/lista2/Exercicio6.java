package com.listasexercicio.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {

        double nota1, nota2, notaRecuperacao, media, novaMedia;

        System.out.println("Digite a primeira nota: ");
        Scanner scannernota = new Scanner(System.in);
        nota1 = scannernota.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scannernota.nextDouble();

        media = (nota1+nota2)/2;

        if (media > 6) {
            System.out.println("Aprovado com média: " + media);
            
        } else { System.out.println("Digite a nota da recuperação: ");
                 notaRecuperacao = scannernota.nextDouble();   
        
           if (nota1 < nota2) {
            nota1 = notaRecuperacao;
           } else {nota2 = notaRecuperacao;
            
           }

           novaMedia = (nota1 + nota2)/2;

           if (novaMedia > 6) {
            System.out.println("Aprovado com média da recuperação: " + novaMedia);
            
           } else { System.out.println("Reprovado após recuperação: " + novaMedia);
            
           }



        }

    }

}