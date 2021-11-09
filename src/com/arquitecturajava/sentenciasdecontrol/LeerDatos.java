package com.arquitecturajava.sentenciasdecontrol;

import java.util.Scanner;

public class LeerDatos {

    public static void main(String[] args) {
        /**
         * @param args the command line arguments
         *
         * */
        Scanner sn = new Scanner(System.in);


        System.out.println("edad: ?");
        int edad = sn.nextInt();

        System.out.println("nota: ?");
        int nota = sn.nextInt();

        //porque no me deja ingresar el texto, solo cuando esta por encima de edad deja?
        System.out.println("nombre: ");
        String nombre = sn.next();


        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(nota);




    }
}