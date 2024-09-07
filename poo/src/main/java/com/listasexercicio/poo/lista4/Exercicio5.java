package com.listasexercicio.poo.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {

        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String comando;

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Inserir um item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            comando = scanner.nextLine();

            switch (comando) {
                case "1":
                    System.out.print("Digite o nome do item para adicionar: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado com sucesso.");
                    break;
                case "2":
                    System.out.println("Lista de Compras:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                    }
                    break;
                case "3":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}