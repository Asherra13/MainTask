package com.project;

public class Task01 {
    private double a, b, c;

    Task01(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void displayInfo()
    {
        String str = "Same numbers are:  ";

        if (a == b)
        {
            str += "a, b";
            if (b == c) str += ", c";
        }
        else if (a == c) str += "a, c";
        else if (b == c) str += "b, c";
        else str = "Numbers are not the same";

        System.out.println(str);
    }
}
