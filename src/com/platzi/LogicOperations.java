package com.platzi;

public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        boolean True=false;

        //operadores asignación
        System.out.println("a es igual a b? ->" + (a==b));
        System.out.println("a es diferente a b? ->" + (a!=b));

        //operadores relacionales
        System.out.println("a es mayor a b? ->"+ (a>b));
        System.out.println("a es menor a b? ->"+ (a<b));
        System.out.println("a es mayor o igual a b? ->"+ (a>=b));
        System.out.println("a es menor o igual a b? ->"+ (a<=b));

        if (a==b){
            System.out.println("a es igual a b? ->");
        }
        else if (a!=b){
            System.out.println("a es diferente a b? ->");
        }else if(a>b){
            System.out.println("a es mayor a b? ->");
        }else if(a<b){
            System.out.println("a es menor a b? ->");
        }else if(a>=b){
            System.out.println("a es mayor o igual a b? ->");
        }else if(a<=b){
            System.out.println("a es menor o igual a b? ->");
        }

        //logic boolean
        if(True)
            System.out.println("True es verdadero: " + True);
        else if(!True) // representa sin el if el mismo "else" solo
            System.out.println("True es verdaderamente falso: " + True);

        //condicional ternario
        String ternarioT = !True ? "True es !true" : "True es falso";
        System.out.println(ternarioT);
    }
}
