package com.practica.platzi;

public class DataTypes {
    public static void main(String[] args) {
        long n= 12345678901L;
        double nD = 123.4567891233;
        float nF = 123.456F;

        var salary = 1000; //int
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Emmanuel";
        System.out.println("EMPLOYEE: "+ employeeName + " SALARY: "+ salary);
    }
}
