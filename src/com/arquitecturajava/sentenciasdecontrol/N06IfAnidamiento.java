package com.arquitecturajava.sentenciasdecontrol;

import java.util.Scanner;

public class N06IfAnidamiento {
    public static void main(String[] args) {

        System.out.print("Ingresa la nota: ");
        Scanner sn=new Scanner(System.in);
        int nota = sn.nextInt();

        boolean oferta = false;
        System.out.println("Estamos de oferta: ?");
        oferta = sn.nextBoolean();

        if (nota >= 0 && nota <=3){
            System.out.println("perdio el examen! no ganas el celular!");
            if(!oferta){
                System.out.println("te pierdes de la oferta");
            }
            else{
                System.out.println("ganaste una oferta a pesar de todo!");
            }

        }
        else if (nota >3 && nota <=5 ){
            System.out.println("gano el examen! te llevas el celular ");
            if(oferta){
                System.out.println("te llevas unos auriculares");
            }
        }
        else if(nota< 0 || nota >5){
            System.out.println("datos invalidos");
        }

    }
}
