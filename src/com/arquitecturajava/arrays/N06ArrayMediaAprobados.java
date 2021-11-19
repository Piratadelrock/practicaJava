package com.arquitecturajava.arrays;

public class N06ArrayMediaAprobados {
    public static void main(String[] args) {
        int[] listaNumeros = new int[]{2,3,7,5,6,1};
        int sumaAprobados=0;
        int totalAprobados=0;

        for (int i = 0; i<listaNumeros.length;i++){
           if(listaNumeros[i]>=5){
               sumaAprobados+=listaNumeros[i];
               totalAprobados++;
               System.out.println(listaNumeros[i]);
           }
        }
        System.out.println(sumaAprobados);
        System.out.println(totalAprobados);
        System.out.println(sumaAprobados/totalAprobados);
    }
}
