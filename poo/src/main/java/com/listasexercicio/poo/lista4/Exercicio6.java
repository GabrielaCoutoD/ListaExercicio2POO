package com.listasexercicio.poo.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao() {

        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String comando;

        while (true) {
            
            System.out.println("Menu:");
            System.out.println("1. Inserir um item");
            System.out.println("2. Ver lista de compras");
            System.out.println("3. Remover um item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            comando = scanner.nextLine();

            switch (comando) {
                case "1":
                    
                    System.out.print("Digite o nome do item para adicionar: ");
                    String itemAdicionar = scanner.nextLine();
                    listaDeCompras.add(itemAdicionar);
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
                    
                    System.out.println("Digite o número do item para remover:");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); 

                    if (indice < 1 || indice > listaDeCompras.size()) {
                        System.out.println("Número inválido. Nenhum item foi removido.");
                    } else {
                        String itemRemover = listaDeCompras.remove(indice - 1);
                        System.out.println("Item '" + itemRemover + "' removido com sucesso.");
                    }
                    break;
                case "4":
                    
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