package com.arquitecturajava.arrays;

public class N01Array {
    public static void main(String[] args) {
        //declaracion de array
        // lista de 3 numeros
        int [] listaNumeros = new int[3];

        // esta lista esta vacia y en cada posicion hay un cero
        System.out.println(listaNumeros[0]);

        //siempre comienzan en 0
        listaNumeros[0]=2;
        listaNumeros[1]=3;
        listaNumeros[2]=7;

        System.out.println(listaNumeros[0]);
        System.out.println(listaNumeros[1]);
        System.out.println(listaNumeros[2]);
    }
}
