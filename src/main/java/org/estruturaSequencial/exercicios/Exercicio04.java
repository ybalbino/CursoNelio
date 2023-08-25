package org.entradaDeDados.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horas * valorHora;

        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f%n" , salario);

        sc.close();
    }
}
