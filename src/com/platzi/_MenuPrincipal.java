package com.platzi;

public class _MenuPrincipal {
    public static void main(String[] args) {

        String mensaje = "Modo de lectura: " +
                "\n 1. Variables " +
                "\n 2. updating variables " +
                "\n 3. NamingJava" +
                "\n 4. DataTypes" +
                "\n 5. IncrementDecrement Operadores Asignacion Incremento y Decremento " +
                "\n 6. MathematicOperations" +
                "\n 7. Casting" +
                "\n 8. " +
                "\n 9. " +
                "\n 10. " +
                "\n";

        System.out.println(mensaje);

        System.out.println("TIPOS DE DATOS NUMERICOS");
        //byte, short, int, long
        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);

        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10;
        System.out.println("numero = " + numero);
    }
}
