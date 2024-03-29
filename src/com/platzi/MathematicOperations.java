package com.platzi;

public class MathematicOperations {
    public static void main(String[] args) {
        //si queremos manejar mas precision para datos, puntos flotantes
        //Valores enteros
        int a = 5;
        int b = 10;

        //Valores con decimales
        double i = 2.1;
        double j = 3.5;

        //Redondea hacia arriba - devuelve un entero hacia arriba 2.1 -> 3.0
        System.out.println(Math.ceil(i));

        //Redondea hacia abajo - 2.1 -> 2.0
        System.out.println(Math.floor(j));

        //Devuelve el valor mayor
        System.out.println(Math.max(a,b));

        //Imprime un numero elevado a otro
        System.out.println(Math.pow(a,b));

        //Devuelve el valor absoluto de un argumento dado
        System.out.println(Math.abs(j));

        //Devuelve la suma de sus argumentos
        System.out.println(Math.addExact(a,b));

        //Devuelve la tangente del arco de un angulo (-pi/2 y pi/2)
        System.out.println(Math.atan(j));

        //Devuelve la raiz cubica de un valor double
        System.out.println(Math.cbrt(i));

        //Devuvleve el coseno hiperbolico de un valor double
        System.out.println(Math.cosh(j));

        //Devuelve el coseno trigonometrico de un angulo
        System.out.println(Math.cos(j));

        //Devuelve el numero elevado a la potencia de un valor double
        System.out.println(Math.exp(i));

        //area de un circulo
        //pi*r2
        System.out.println(Math.PI * Math.pow(j,2));

        //area de una esfera
        //4*pi*r2
        System.out.println(4*Math.PI * Math.pow(j,2));
        //volumen de una esfera
        //4*pi*r2
        System.out.println((4/3)*Math.PI * Math.pow(j,2));

    }
}
