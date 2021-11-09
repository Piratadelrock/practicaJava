package com.arquitecturajava.sentenciasdecontrol;

import java.util.Scanner;

public class N08Switch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("ingrese el dia: ");
        String dia = sc.next();

      /*
      // "lunes"||"martes"||"miercoles"||"jueves"||"sabado"||"domingo"

      // [ "lunes","martes","miercoles","jueves","sabado","domingo"]

       String[] diasSemana = {
                "lunes","martes","miercoles","jueves","sabado","domingo"
        };
                dia.equalsIgnoreCase(diasSemana);
*/



        if (dia.equalsIgnoreCase("Lunes")) {
            dia = "Lunes";
        }
        else if (dia.equalsIgnoreCase("Martes")) {
            dia = "Martes";
        }
        else if (dia.equalsIgnoreCase("Miercoles")) {
            dia = "Miercoles";
        }
        else if (dia.equalsIgnoreCase("Jueves")) {
            dia = "Jueves";
        }
        else if (dia.equalsIgnoreCase("Viernes")) {
            dia = "Viernes";
        }
        else if (dia.equalsIgnoreCase("Sabado")) {
            dia = "Sabado";
        }
        else if (dia.equalsIgnoreCase("Domingo")) {
            dia = "Domingo";
        }

        switch (dia){
            case "Lunes":
                System.out.println("Lunes");
                break;
            case "Martes":
                System.out.println("Martes");
                break;
            case "Miercoles":
                System.out.println("Miercoles");
                break;
            case "Jueves":
                System.out.println("Jueves");
                break;
            case "Viernes":
                System.out.println("Viernes");
                break;
            case "Sabado":
                System.out.println("Sabado");
                break;
            case "Domingo":
                System.out.println("Domingo");
                break;
            default:
                System.out.println("información inválida ");
        }

    }
}
