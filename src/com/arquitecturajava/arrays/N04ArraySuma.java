package com.arquitecturajava.arrays;

public class N04ArraySuma {
    public static void main(String[] args) {
        //declaro array
        int[] listaNumeros = new int[]{2,4,5,7,8};
        int acumulador = 0;

        for (int i=0;i<listaNumeros.length;i++ ){
            acumulador +=  listaNumeros[i];
        }
        System.out.println(acumulador);

    }
}
