package com.platzi;

//Upper Camel Case el nombre de clase debe ser identico al nombre del archivo
public class NamingJava {
    public static void main(String[] args) {
        int celphone = 331313;
        int celPhone = 1234;
        System.out.println(celphone);
        System.out.println(celPhone);
        //debe ser tenerse en cuenta las mayúsculas y minúsculas

        //formas correctas de inicializar una variable
        String $countryName = "Spain";
        String _backgroundColor = "Green";

        String currency$ = "MXN";
        String background_color = "BLUE";

        //CONSTANTES
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        final int MIN_WIDTH = 1;
        //final: en java hay una keyword que sea literalmente una constante y nunca cambie su valor

        //Lower Camel Case
        String fullName = "Emmanuel José Lopera Rojo";
        int sizeInCentimeters = 41;


    }
}
