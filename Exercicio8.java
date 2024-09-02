package com.desvioscondicionais.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao() {

        int acertos = 0;
        int erros =0 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Quiz Senhor dos Anéis \n");
      
        
        // Pergunta número 1
        System.out.println("1. Em \"O Senhor dos Anéis\", qual é o verdadeiro nome do mago conhecido como Gandalf?\n");
        System.out.println("a) Saruman");
        System.out.println("b) Mithrandir");
        System.out.println("c) Radagast");
        System.out.println("d) Sauron");
        System.out.println("e) Alatar");
        
        String pergunta = scanner.nextLine();

        if (pergunta.equals("b") || pergunta.equals("B")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
        }

        //Pergunta 2
        System.out.println("2. Em \"Senhor dos Anéis\", qual é o nome da cidade élfica onde Frodo e seus amigos são bem-vindos após sua fuga de Hobbiton?");
        System.out.println("a) Rivendell");
        System.out.println("b) Lothlórien");
        System.out.println("c) Gondor");
        System.out.println("d) Isengard");
        System.out.println("e) Minas Tirith");

        pergunta = scanner.nextLine();

        if (pergunta.equals("a") || pergunta.equals("A")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
        }

        //Pergunta 3
        System.out.println("3. Em \"Senhor dos Anéis\", quem é o líder dos Nazgûl?");
        System.out.println("a) Sauron");
        System.out.println("b) Saruman");
        System.out.println("c) O Rei Bruxo de Angmar");
        System.out.println("d) Gothmog");
        System.out.println("e) Gríma Wormtongue");

        pergunta = scanner.nextLine();

        if (pergunta.equals("c") || pergunta.equals("C")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }


        //Pergunta 4
        System.out.println("4. Em \"Senhor dos Anéis\", qual é o nome do pai de Aragorn?");
        System.out.println("a) Elendil");
        System.out.println("b) Isildur");
        System.out.println("c) Denethor");
        System.out.println("d) Eärendil");
        System.out.println("e) Arathorn");
      
        pergunta = scanner.nextLine();

        if (pergunta.equals("e") || pergunta.equals("E")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }


        //Pergunta 5

        System.out.println("Em \"Senhor dos Anéis\", o que é o Um Anel?");
        System.out.println("a)  Um anel de invisibilidade dado a Frodo por Bilbo");
        System.out.println("b) Uma espada antiga que pertenceu a Aragorn");
        System.out.println("c) Uma relíquia dos elfos que dá poder sobre a natureza");
        System.out.println("d) Um artefato mágico criado por Sauron para controlar todos os outros anéis");
        System.out.println("e) Um artefato que pode reviver os mortos");

        pergunta = scanner.nextLine();

        if (pergunta.equals("d") || pergunta.equals("D")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }

        if (acertos >= 3) {
            System.out.println("\nParabéns!!!");
            System.out.println("\nVocê ganhou");
            System.out.println("\nVocê acertou: " + acertos + " e errou: "+ erros);
        }
   
    }

    
}
