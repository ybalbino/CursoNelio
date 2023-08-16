package org.entradaDeDados.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, soma;

        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.println("Soma = " + soma);

        sc.close();

//        int x = 10;
//        int y = 30;
//        int soma = x + y;
//        System.out.println("Soma: " + soma);
//
//        int a = -30;
//        int b = 10;
//        int c = a + b;
//        System.out.println("Soma: " + c);
//
//        int e = 0;
//        int f = 0;
//        int g = e + f;
//        System.out.println("Soma: " + g);

    }
}
