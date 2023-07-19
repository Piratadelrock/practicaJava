package com.platzi;

public class SeñalSOS {
    // ... _ _ _ ... ella lo llamo WhileLoop

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i<=3){
            printSOS();
            i++;
        }

    }
    public static void printSOS(){
        System.out.println("... _ _ _ ...");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }

}
