package com.arquitecturajava.basicos;

import java.util.Scanner;

public class LeerScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("introduce la nota: ");
        int nota = sc.nextInt();

        System.out.println("la nota introducida es: " + nota);

        System.out.print("introduce la nota 2 a duplicar: ");
        int nota2 = sc.nextInt();
        System.out.println("el resultado es: " + (nota2*2));





    }
}
