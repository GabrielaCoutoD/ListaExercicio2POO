package com.listasexercicio.poo.lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao() {

        String loginOk = "podeentrar";
        String senhaOk = "tent123";

        int tentativas = 3;

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("Digite o login: ");
            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(loginOk) && senha.equals(senhaOk)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                if (tentativa < 3) {
                    if (!login.equals(loginOk)) {
                        System.out.println("Login incorreto.");
                    }
                    if (!senha.equals(senhaOk)) {
                        System.out.println("Senha incorreta.");
                    }
                    System.out.println("Tentativas restantes: " + (3 - tentativa));
                } else {
                    System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                }
            }
        }

            }
}
