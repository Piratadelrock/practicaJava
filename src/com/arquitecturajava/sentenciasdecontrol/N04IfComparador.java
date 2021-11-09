package com.arquitecturajava.sentenciasdecontrol;

public class N04IfComparador {
    public static void main(String[] args) {
        String num = "Hola";
        String str = "hOlA";

        if(num == str){
            System.out.println("estoy en num == str"); // true
        }

        if (num.equals(str))
        {
            System.out.println("estoy en num.equals(str)");
            System.out.println(num.equals(str)); // false
        }


        if(num.equalsIgnoreCase(str)){
            System.out.println("estoy en num.equalsIgnoreCase(str)");
            System.out.println(num.equalsIgnoreCase(str)); //true

            System.out.println("num==str");
            System.out.println(num == str);// false

            System.out.println("num.equals(str)");
            System.out.println(num.equals(str)); // false
        }


    }
}
