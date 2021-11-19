package com.arquitecturajava.arrays;

public class N06ArrayNuevaLista {
    public static void main(String[] args) {

        int[] listaNumeros = new int[]{2,3,7,5,6,1};

        int numeroAprobados=0;
        for (int i = 0; i<listaNumeros.length;i++){
           if(listaNumeros[i]>=5){
                numeroAprobados++;
           }
        }
        System.out.println("lista de aprobados: "+numeroAprobados);//

        //ejemplo de pasar un array a otro (una lista a una nueva lista)
        int[] listaAprobados= new int[numeroAprobados];
        int posicionAprobados= 0;

        for (int i = 0; i<listaNumeros.length;i++){
            if(listaNumeros[i]>=5){
                /*con el nuevo array de 3 elementos que tiene un tamaño a medida para los examenes aprobados
                * voy asignando la nota de los aprobados a cada posicion del array */
                listaAprobados[posicionAprobados]=listaNumeros[i];
                posicionAprobados++;
            }
        }
        //tamaño de la nueva lista
        System.out.println("numero de aprobados nueva lista : "+listaAprobados.length);

        for (int i=0;i<listaAprobados.length;i++){
            System.out.println(listaAprobados[i]);
        }

    }
}
