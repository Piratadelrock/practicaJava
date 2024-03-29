package com.platzi;

public class Arrays {
    public static void main(String[] args) {
        //declaracion de 17 espacios PARA SIEMPRE
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[5][2];
        /**
         * Tabla de ciudades y países
         * // new String[filas][columnas];
         * +-------------------+------------------+
         * |     País          |      Ciudad      |
         * +-------------------+------------------+
         * |  Colombia         |   Rionegro       |
         * |  Estados Unidos   |   Nueva York     |
         * |  Francia          |   París          |
         * |  Japón            |   Tokio          |
         * |  Brasil           |   Río de Janeiro |
         * +-------------------+------------------+
         */
        // en cuando se empieza a definir arreglos de 3 elementos en la parte practica de manejo de datos lo mejor es llevarlo a una base de datos

        int[][][] numbers3D = new int[2][2][2];
        int[][][][] numbers4D = new int[2][2][2][2];

        androidVersions[0] = "Apple pie" ;
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);

        // especie de coordenadas
        cities[0][0] = "Colombia";
        cities[0][1] = "Rionegro";
        cities[1][0] = "Estados Unidos";
        cities[1][1] = "Nueva York";
        cities[1][0] = "Estados Unidos";
        cities[1][1] = "Nueva York";


        System.out.println(
                "         * +-------------------+------------------+\n" +
                "         * |     País          |      Ciudad      |\n" +
                "         * +-------------------+------------------+\n" +
                "         * /    "+(cities[0][0]+"       :    "+cities[0][1])+"      / \n"+
                "         * +-------------------+------------------+"

        );

        //[filas][columnas][elementos][espacios]
        String [][][][] animals = new String [2][3][2][2];

        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);

    }
}
