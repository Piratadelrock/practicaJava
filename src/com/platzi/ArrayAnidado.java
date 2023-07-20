package com.platzi;

public class ArrayAnidado {
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
                             //17 sin embargo se dice que los indices son n-1 por lo que deberiamos restarle -1 o dejarlo solo < y no <=
        for (int i = 0; i < androidVersions.length; i++) {
            String version = androidVersions[i];
            if(version != null){
                System.out.println(version);
            }
        }


        // especie de coordenadas
        cities[0][0] = "Colombia";
        cities[0][1] = "Rionegro";
        cities[1][0] = "Estados Unidos";
        cities[1][1] = "Nueva York";
        cities[1][0] = "Estados Unidos";
        cities[1][1] = "Nueva York";

//        cities.length la numeracion que genera los renglones
        System.out.println("tamaño de filas" + cities.length);
        System.out.println("tamaño de las columnas en la fila seleccionada "+cities[0].length);

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

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
