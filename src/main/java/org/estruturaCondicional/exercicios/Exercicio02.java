package org.estruturaCondicional.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("PAR " + num);
        } else {
            System.out.println("IMPAR " + num);
        }
        
        sc.close();
    }
}
