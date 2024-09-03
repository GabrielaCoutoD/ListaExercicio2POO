package com.listasexercicio.poo.lista1;

import java.util.Scanner;
import java.util.Scanner;

public class Exercicio8 {
   public static void resolucao() {

        

        double celsius;
        double fahrenheit;

        System.out.println("Didite a temperatura em Fahrenhei: ");
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();

        celsius = ((fahrenheit - 32)*5/9);

        System.out.printf("Temperatura em Celsius é: "+ celsius + " Celsius");
        
    }
}