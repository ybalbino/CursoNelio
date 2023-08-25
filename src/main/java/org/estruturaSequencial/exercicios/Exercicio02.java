package org.entradaDeDados.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, pi = 3.14159;

        b = sc.nextDouble();
        a = pi * b * b;

        System.out.printf("a = %.4f%n" , a);

        sc.close();
    }
}
