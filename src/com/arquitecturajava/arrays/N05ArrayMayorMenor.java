package com.arquitecturajava.arrays;

public class N05ArrayMayorMenor {
    public static void main(String[] args) {
        int[] listaNumeros= new int[]{4,2,1,2,6,7};
        //comparando los numeros para encontrar el mayor y menor de los numeros
        int mayor = listaNumeros[0];
        int menor = listaNumeros[0];

        for (int i = 0; i<listaNumeros.length;i++){
            if(mayor<listaNumeros[i]){
                mayor=listaNumeros[i];
            }
            if (listaNumeros[i]<menor){
                menor=listaNumeros[i];
            }
        }
        System.out.println(mayor);
        System.out.println(menor);

    }
}
