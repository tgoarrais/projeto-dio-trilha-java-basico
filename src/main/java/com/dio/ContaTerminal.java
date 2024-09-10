package com.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero = 1022;
        String agencia = "067-8";
        String nomeCliente = "THIAGO ARRAIS";
        double saldo = 365.5;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite o Numero da conta");
        numero = scanner.nextInt();

        // Limpa o buffer após a leitura do número
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        System.out.println("Digite o Numero da Agencia");
        agencia = scanner.nextLine();  // Ler a linha inteira para a agência

        System.out.println("Digite o Nome do Cliente");
        nomeCliente = scanner.nextLine();  // Ler a linha inteira para o nome do cliente

        System.out.println("Digite o Saldo da conta");
        saldo = scanner.nextDouble();

        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close(); // Fechar o Scanner
    }
}
