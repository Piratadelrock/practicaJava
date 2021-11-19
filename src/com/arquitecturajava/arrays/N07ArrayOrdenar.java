package com.arquitecturajava.arrays;

public class N07ArrayOrdenar {
    //array de numeros
    static int[] listaNumeros2 = new int[]{3,2,7,5,6,1};
    //funcion de numeros tomados de parametro del array

     static int[] Numeros(int[] nums){
        int[] numeros= nums;
      return numeros;
    }

    public static void main(String[] args) {
        // int[] listaNumeros = new int[]{3,2,7,5,6,1};
        int[] listaNumeros = Numeros(listaNumeros2);

        boolean noOrdenado =true;

        while(noOrdenado){
            //noOrdenado estara ordenado se pone false
            noOrdenado=false;

            for (int i = 0; i<listaNumeros.length-1;i++){
                //intercambiar los valores de dos posiciones del array
                System.out.println("Estoy actualmente en "+listaNumeros[i]+" del array actual en el ciclo");
                    for (int j =0; j<listaNumeros.length;j++){
                        System.out.println(listaNumeros[j]);
                    }

                //region RevisaElOrden
                if(listaNumeros[i]>listaNumeros[i+1]){
                    //almacena el primer valor comparado para enviar al segundo valor
                    int  temporal=listaNumeros[i];
                    listaNumeros[i]=listaNumeros[i+1];
                    listaNumeros[i+1]=temporal;
                    noOrdenado=true;
                }
                //endregion
              //  System.out.println(noOrdenado);
            }
            System.out.println(noOrdenado);
        }
        //recorrer la informacion ordenada
            for (int i =0; i<listaNumeros.length;i++){
                System.out.println(listaNumeros[i]);

            }
        System.out.println(noOrdenado);
    }

}
