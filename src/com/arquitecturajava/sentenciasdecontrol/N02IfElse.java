package com.arquitecturajava.sentenciasdecontrol;

import java.util.Scanner;

public class N02IfElse {
    public static void main(String[] args) {

        //para leer por pantalla la nota
        Scanner scn= new Scanner(System.in);

        System.out.print("Que nota tienes?: ");;
        //se recibe el dato
        int nota = scn.nextInt();

        if (nota > 5){
            System.out.println("has aprobado te compran el balon!");
        }
        else if(nota==5){
            System.out.println("has aprobado muy justo!");
        }
        else{
            System.out.println("estudia más!");
        }
    }
}
