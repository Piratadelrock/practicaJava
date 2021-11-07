package com.practica.platzi;

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //gano bono $200
        int bono = 200;
        salary = salary + bono;
        System.out.println(salary);
        // pension: $50 pesos
        salary = salary - 50;
        System.out.println(salary);
        // hizo 2 horas extra $30 c/u
        // menos costos de Comida : $45
        salary = salary +(2*30)-45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Jose";
        employeeName = employeeName + " Lopera";
        System.out.println(employeeName);

        employeeName = "Emmanuel " + employeeName;
        System.out.println("Tu nombre es: "+employeeName);

    }
}
