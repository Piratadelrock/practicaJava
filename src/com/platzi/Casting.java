package com.platzi;

public class Casting {
    public static void main(String[] args) {

        //En un año ubicar 30 perritos... Cuántos perritos ubique al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);// 2.5

        /*
         .0 para respetar el tipo de dato de double
         la respuesta sale en 2.5 pero como es posible ubicar .5, esto no tiene sentido por lo que este tipo de casos
         no interesa saber mucho la precision sino la estimacion.
         por lo que
        */

        //cuando nosotros convertimos un tipo de dato que es bastante grande y lo convertimos a un tipo de dato mas pequeño lo que
        // sucede es que se TRUNCA el numero decimal
        //TRUNCAR es como eliminar

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs; //casteando a entero el decimal, de 2.5 que seria exacto
        System.out.println(estimatedMonthlyDogs);// 2


        //EXACTITUD
        int a= 30;
        int b= 12;
        System.out.println((double) a/b); //2.5 este casting es manual, transformandolo a double desde el int y asi podemos tomar toda la cantidad de decimales que acarrea

        //si hacemos la division de un numero entero sera un resultado de numero entero
        //si lo introducimos en un double el resultado del numero entero no hay error
        double c= a/b; //no forzamos el double, entonces realiza casting automatico
        System.out.println(c);//2.0

        //necesitamos precision debe ser automatico aca estamos usando enteros a double
        //entonces casteamos el resultado de los datos enteros
        double d= (double) a/b;
        System.out.println(d);//2.5 se castea manual porque necesito saber la precision de cuantos datos son

        //castear char a un entero
        char n= '1';
        int nI = n;
        System.out.println(nI);//49
        //caracter 49  -> codigo ascii

//        short nS = n; //char es mas grande que el short por lo que se debe ejecutar el casting explicito
        short nS = (short) n;
        System.out.println(nS); //49
    }
}
