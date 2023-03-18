package com.practica.platzi;

public class IncrementDecrement {
    public static void main(String[] args) {

        //imaginando el juego de mario bross puede ganar o perder vidas
        //count lifes
        int lives = 5;

        //PostFija
        //imaginando que algo paso
        lives = lives - 1;
        System.out.println(lives);//4

        lives--; //Decremento
        System.out.println(lives);//3

        //agarro un hongo

        lives++; //incremento
        System.out.println(lives);//4

        //PreFija
        //gana un regalo por ganar una vida
//        System.out.println(lives++);
//        System.out.println(lives++);
        int gift = 100 + lives++; //postfijo no le damos la vida solo el regalo queda en 104
        System.out.println(gift); //104
        System.out.println(lives); //5

        //Prefija
        int gift2 = 100 + ++lives; // en este punto tenemos la vida en 5 pero mario volvio a tomar una vida y el le damos un regalo con la vida tomada
        System.out.println(gift2); //106
        System.out.println(lives); //6

        //lives++ postfijo se accede primeramente al dato de la variable sin importar si esta incrementado o no
        //++lives prefijo se accede a la variable y la incrementa
//        Postfijo este primero accede al dato y realiza la operación, en cambio prefijo obtiene el dato incrementado.

    }
}
