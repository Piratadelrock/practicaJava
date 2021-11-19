package com.arquitecturajava.bucles;

public class N09CombinacionAnida {
    public static void main(String[] args) {
        //operador especial de modulo o de division entera
        int num1 = 8;
        int num2 = 3;
        /*operador % es el modulo y nos devuelve el resto de una division entera
        * de dos numeros
        * si yo divido 6/3=2 por lo tanto no hay ningun resto y nos devuelve 0 tambien nos da a entender que el numero sera par*/
        int resto = num1%num2;
        System.out.println(resto);

        //cuantos numeros divisibles entre 3 hay en los primeros 100

        int divisibles2=0;
        int divisibles3=0;
        for(int i=1;i<=100;i++){
            if(i%3==0){
                divisibles3++;
            }
            else if (i%2==0){
                divisibles2++;
            }
        }
        System.out.println("----DIVISIBLES POR 2----");
        System.out.println(divisibles2);
        System.out.println("----DIVISIBLES POR 3----");
        System.out.println(divisibles3);



    }
}
