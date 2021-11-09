package com.arquitecturajava.bucles;

public class N02ForTablaMult {
    public static void main(String[] args) {
        //2x1=2
/*
        for (int i=1;i<=10;i++){

            System.out.println("2x"+i+"="+i*2);
        }
*/

//TABLA DE MULTIPLICAR HASTA EL 10 COMPLETA
        for (int j=1;j<=10;j++){
            System.out.println("Tabla de multiplicar del "+j);
            for (int q=1;q<=10;q++){
                System.out.println(j+"x"+q+"="+(j*q));

                //System.out.println(j);
               // System.out.println(q);
            }
        }

    }
}
