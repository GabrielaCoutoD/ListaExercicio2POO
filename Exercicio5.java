package com.desvioscondicionais.lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {

        String login_certo = "usuario";
        String senha_certo = "senha123";

        System.out.println("Login: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        if (login.equals(login_certo) && senha.equals(senha_certo)) {
            System.out.println("Bem vindo");
           }

        else if (!login.equals(login_certo) && !senha.equals(senha_certo)) {
            System.out.println("Senha e login errados");

        } 

        else if (!login.equals(login_certo)) {
            System.out.println("Login errado");
           }

        else if (!senha.equals(senha_certo)){
            System.out.println("Senha errada");

        }  

            
    }

}
