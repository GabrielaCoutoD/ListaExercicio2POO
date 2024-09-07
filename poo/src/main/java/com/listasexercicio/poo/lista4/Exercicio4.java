package com.listasexercicio.poo.lista4;

public class Exercicio4 {
    public static void resolucao() {

        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int contadorPares = 0;

        for (int numero : lista) {
                    
            if (numero % 2 == 0) {
                contadorPares++;
             }
        }
                
                
        System.out.println("Quantidade de números pares na lista: " + contadorPares);
    }
}
