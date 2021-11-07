package com.practica.platzi;

public class Funciones {
    public static void main(String[] args) {
        double y=3;
        //area de un circulo
        //pi*r2
        double area = circleArea(y);
        System.out.println(circleArea(y));

        //area de una esfera
        //4*pi*r2
        System.out.println(sphereArea(y));
        //volumen de una esfera
        //4*pi*r2
        System.out.println(sphereVolumen(y));

        //moneda convertida a dolar
        System.out.println("Pesos a dolares: " + convertToDollar(1000, "COP"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Funcion que especificando su moneda comvierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double convertToDollar(double quantity, String currency){
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
