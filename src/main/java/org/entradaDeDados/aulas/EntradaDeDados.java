package org.entradaDeDados.aulas;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        double z;
        int y;
        char a;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        a = sc.next().charAt(0);
//        System.out.println("Você digitou: " + x + " " + y + " " + z +
//                " " + a);
        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

        sc.close();
    }
}
