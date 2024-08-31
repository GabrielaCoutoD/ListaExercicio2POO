package com.desvioscondicionais.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {

        int idade;
        String gestanteResposta;
        String deficienteResposta;

    
        System.out.println("Qual a sua idade: ");
        Scanner scannerleia = new Scanner(System.in);
        idade = scannerleia.nextInt();

        System.out.println("Está gestante? (sim/não) ");
        gestanteResposta = scannerleia.nextLine();
        boolean gestante = gestanteResposta.equals("sim)");
        
        System.out.println("Possui alguma deficiência? (sim/não)");
        deficienteResposta = scannerleia.nextLine();
        boolean deficiente = deficienteResposta.equals("sim)");

        if (idade > 65 || deficiente || gestante) {
            System.out.println("Fila preferencial");

           } else { System.out.print("Fila comum");
                
            }
            
        }

    }


              