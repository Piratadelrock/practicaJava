package com.arquitecturajava.sentenciasdecontrol;

public class CuartoIfComparador {
    public static void main(String[] args) {
        String num = "0";
        String str = "0";

        if(num == str){
            System.out.println(num == str); // true
        }
        else if (num.equals(str))
        {
            System.out.println(num == str); // false
        }
    }
}
