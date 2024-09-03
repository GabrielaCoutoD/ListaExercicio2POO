package com.listasexercicio.poo.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
public static void resolucao() {

    Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorEmReal;
        double dolar = 5.25;

        System.out.println("Escreva o valor em real: ");
        Scanner scannerleia = new Scanner(System.in);
        valorEmReal = scannerleia.nextDouble();
        


        System.out.printf("O valor em dólar é:  $"+(dolar*valorEmReal));
    
}
}


