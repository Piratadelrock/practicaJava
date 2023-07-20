package com.platzi;
import java.util.Arrays;
public class ArrayAnidado {
    public static void main(String[] args) {
//        a los arreglos de 1 dimension se le llaman vectores a los de dos matrices a los 3 tensores
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
        // en cuando se empieza a definir arreglos de
        // 3 elementos en la parte practica de manejo
        // de datos lo mejor es llevarlo a una base de datos

        int[][][] numbers3D = new int[2][2][2];
        int[][][][] numbers4D = new int[2][2][2][2];

        androidVersions[0] = "Apple pie" ;
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

                             //17 sin embargo se dice que los indices son n-1 por lo que deberiamos restarle -1 o dejarlo solo < y no <=
        /*for (int i = 0; i < androidVersions.length; i++) {
            String version = androidVersions[i];
            if(version != null){
                System.out.println(version);
            }
        }*/

        for (String androidVersion: androidVersions) {
            System.out.println("foreach:"+ androidVersion);
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

        /*for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }*/

//       pair trae un array de datos de una dimension tomando la posicion cero de filas y sacando los datos de esa fila
        for (String [] pair: cities) {
            for (String name: pair) {
                System.out.println("Cities: " + name);
            }
        }

//        System.out.println(
//                "         * +-------------------+------------------+\n" +
//                        "         * |     País          |      Ciudad      |\n" +
//                        "         * +-------------------+------------------+\n" +
//                        "         * /    "+(cities[0][0]+"       :    "+cities[0][1])+"      / \n"+
//                        "         * +-------------------+------------------+"
//
//        );

        //[filas][columnas][elementos][espacios]
        String [][][][] animals = new String [2][3][2][2];

//        System.out.println();
//        System.out.println();
//        System.out.println(animals[1][0][0][1]);
        animals[1][0][0][1] = "Monkey";

        //nulls son parte del recorrido
        /*for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                 }

            }
        }*/


        animals[1][0][0][1] = "Monkey";

        for (String[][][] array1 : animals) {
            System.out.println("array1: " + Arrays.deepToString(array1));

            for (String[][] array2 : array1) {
                System.out.println("array2: " + Arrays.deepToString(array2));
                for (String[] array3 : array2) {
                    System.out.println("array3: " + Arrays.deepToString(array3));
                    for (String animal : array3) {
                        if (animal == null)
                        {
                            continue;
                        }
                        System.out.println(animal);
                    }
                }
            }
        }

    }
}
