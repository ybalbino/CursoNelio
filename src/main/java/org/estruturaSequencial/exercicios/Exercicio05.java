package org.entradaDeDados.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();
        double total = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf("Valor a pagar: R$  %.2f%n" , total);
    }
}
