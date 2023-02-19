package com.practica.platzi;

public class DataTypes {
    public static void main(String[] args) {

        int n= 1234567890;
        //se debe colocar una L al final para definirlo como long
        long nL= 12345678901L;

        double nD = 123.4567891233;
        //se debe colocar una F al final para definir el float
        float nF = 123.456F;

        var salary = 1000; //int
        var pension = salary*0.03; //Double
        var totalSalary = salary - pension; //Double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Emmanuel";
        System.out.println("EMPLOYEE: "+ employeeName + " SALARY: " + totalSalary);



    }
}
