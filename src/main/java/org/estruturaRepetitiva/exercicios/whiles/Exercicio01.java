package org.estruturaRepetitiva.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha == 2002){
            System.out.println("Acesso permitido");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

//        if (senha != 2002){
//            System.out.println("Senha invalida");
//        }

        sc.close();
    }
}
