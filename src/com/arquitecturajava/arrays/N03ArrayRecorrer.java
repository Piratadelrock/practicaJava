package com.arquitecturajava.arrays;

public class N03ArrayRecorrer {
    public static void main(String[] args) {

        int[] listaNumeros = new int[]{2,3,7,12,22};

        System.out.println("tamaño de la lista: "+listaNumeros.length);

        for (int i=0;i<listaNumeros.length;i++){
            int j=1;
            System.out.println("posición : "+(j)+" valor: "+listaNumeros[i]);
        }
    }
}
