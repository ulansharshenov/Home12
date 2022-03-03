package com.company;

public class Triangle {
    int a;
    int b;
    int c;

    void area(){
        double p = (a+b+c)/2d;
        double square = p*(p-a)*(p-b)*(p-c);
        double result = Math.sqrt(square);
        System.out.println("Square of triangle is " + result);
    }
}
