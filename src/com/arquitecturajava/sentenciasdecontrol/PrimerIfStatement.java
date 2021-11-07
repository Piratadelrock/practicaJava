package com.arquitecturajava.sentenciasdecontrol;

import java.util.Scanner;

public class PrimerIfStatement {
    public static void main(String[] args) {
        //falso o verdadero
        boolean cierto = false;
        int nota1 = 2;
        int nota2 = 7;
        cierto = nota2>nota1;
        System.out.println(cierto); //true

        boolean falso= false;
        falso = nota1>nota2;
        System.out.println(falso); //false

        if (nota1<nota2){
            System.out.println("la nota 1: "+ nota1 + " es menor a la nota2: "+ nota2);
        }




    }
}
