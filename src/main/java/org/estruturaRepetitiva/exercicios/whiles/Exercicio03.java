package org.estruturaRepetitiva.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoDeCombustivel = sc.nextInt();

        while (tipoDeCombustivel != 4){

            if (tipoDeCombustivel == 1){
                alcool = alcool + 1;
            } else if (tipoDeCombustivel == 2) {
                gasolina = gasolina + 1;
            } else if (tipoDeCombustivel == 3){
                diesel = diesel + 1;
            }

            tipoDeCombustivel = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADA!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
