package org.entradaDeDados.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a * c / 2;
        double circulo = c * c * 3.14159;
        double trapezio = (a + b) / 2 * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n" , triangulo);
        System.out.printf("CIRCULO: %.3f%n" , circulo);
        System.out.printf("TRAPEZIO: %.3f%n" , trapezio);
        System.out.printf("QUADRADO: %.3f%n" , quadrado);
        System.out.printf("RETANGULO: %.3f%n" , retangulo);

        sc.close();
    }
}
