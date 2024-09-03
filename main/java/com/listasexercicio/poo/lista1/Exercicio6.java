package com.listasexercicio.poo.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {
       
        int distanciaKM;
        int combustivelGasto;

        int consumoMedio;

        System.out.println("Digite a distância percorrida em KM: ");
        Scanner sc = new Scanner(System.in);
        distanciaKM = sc.nextInt();

        System.out.println("Digite o total de combustivel gasto: ");
        combustivelGasto = sc.nextInt();

        consumoMedio = distanciaKM/combustivelGasto;

        System.out.println("O consumo médio do veiculo é: " + consumoMedio + " km/l");

    }
}

