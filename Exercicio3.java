package com.desvioscondicionais.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {

        int idade;
        String gestanteResposta;
        String deficienteResposta;

    
        System.out.println("Informe a sua idade: ");
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Está gestante? (sim/não) ");
        gestanteResposta = scanner.nextLine();
        
        
        System.out.println("Possui alguma deficiência? (sim/não)");
        deficienteResposta = scanner.nextLine();
       

        if (idade > 65 || gestanteResposta.equals("sim") || deficienteResposta.equals("sim") ) {
            System.out.println("Fila preferencial");

           } else { System.out.print("Fila comum");
                
            }
            
            scanner.close();

        }

    }