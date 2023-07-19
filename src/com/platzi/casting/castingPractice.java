package com.platzi.casting;

public class castingPractice {
    public static void main(String[] args) {

//        Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.
//        char c = ‘z’; conviertelo a int
//        int i = 250; conviertelo a long y luego de long a short
//        double d = 301.067; conviertelo a long
//        int i = 100; súmale 5000.66 y conviertelo a float
//        int i = 737; multiplícalo por 100 y conviertelo a byte
//        double d = 298.638; divídelo entre 25 y conviertelo a long

        //CONVERSION
        //in
        char c = 'z';
        int cI = (int) c;

        //int>>long>>short
        int i = 250;
        long iL = i;
        short iLS= (short) iL;


        //int>> short >> long
        short iShort = (short)i;
        long iLong = iShort; //#2


        double d = 301.067;
        long dL = (long)301.067;

        int iCIEN = 100;
        float iFl= (float) (iCIEN + 5000.66);

        int iSIET = 737;
        byte iB = (byte) (iSIET*100) ;

        double dT = 298.638;
        long dLong = (long) (dT/25);


        //out:
        System.out.println("char>>int: "+ c + " es: " + cI);

        System.out.println("int>>long>>short: " + iLS);
        System.out.println("int>>long: " + iL);
        System.out.println("int>> short >> long: " + iLong);


        System.out.println("double >> long: "+ dL);

        System.out.println("sumando 5000.66 al 100 y convirtiendo en float: "+iFl);

        System.out.println("Multiplicalo por 100 y conviertelo en byte: " + iB);

        System.out.println(" dLong: " + dLong);

    }
}
