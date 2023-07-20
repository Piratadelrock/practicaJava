package com.platzi;

public class ForLoop {
    // ... _ _ _ ... ella lo llamo WhileLoop
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        System.out.println(turnOnOffLight());

        for (int i = 1; isTurnOnLight && i <= 10; i++) {
            printSOS();

        }

    }


    public static void printSOS(){
        System.out.println("... _ _ _ ...");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }


}
