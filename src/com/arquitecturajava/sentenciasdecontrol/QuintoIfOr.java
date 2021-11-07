package com.arquitecturajava.sentenciasdecontrol;

import java.util.Scanner;

public class QuintoIfOr {
    public static void main(String[] args) {
        System.out.print("Ingresa la nota: ");
        Scanner sn=new Scanner(System.in);

        int nota = sn.nextInt();
        if (nota >= 0 && nota <=3){
            System.out.println("perdio el examen! no ganas el celular!");
        }
        else if (nota >3 && nota <=5 ){
            System.out.println("gano el examen! te llevas el celular ");
        }
        else if(nota< 0 || nota >5){
            System.out.println("datos invalidos");
        }
    }
}
