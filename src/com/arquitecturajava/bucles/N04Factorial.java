package com.arquitecturajava.bucles;

import java.util.Scanner;

public class N04Factorial {
    public static void main(String[] args) {
        //factorial
        //2
        //6
        //24
        // 120
        //5! =  5x4x3x2x1=120


        double factorial = 1;
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i=1;i<=numero;i++){
            factorial = factorial*i;
        }
        System.out.println("el factorial de "+numero+" = "+factorial);

    }
}
