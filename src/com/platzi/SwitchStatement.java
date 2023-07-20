package com.platzi;

public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark");
                break;
            case "Night": //Ambar
                System.out.println("Seleccionaste Dark");
                break;
            default:
                System.out.println("Selecciona una opcion");
        }


        //switch spoiler a partir de java 12


    }
}
