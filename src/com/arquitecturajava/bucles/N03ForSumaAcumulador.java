package com.arquitecturajava.bucles;

public class N03ForSumaAcumulador {
    public static void main(String[] args) {
        // la suma de los primeros 10 numeros
        System.out.println("Suma de los 10 primeros numeros");
        int suma = 0;

        for (int i=1;i<=10;i++){
            System.out.println("iteracion: "+i);
            suma = suma +i;
            System.out.println("suma actual: "+ suma);
        }
        System.out.println(suma);
    }
}
