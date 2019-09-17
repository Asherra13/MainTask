package com.project;

public class Task01 {
    private Point a, b, c;
    Task01(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDistant(Point a, Point b)
    {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    void displayInfo()
    {
        if( (getDistant(a, b) + getDistant(a, c) <= getDistant(c, b)) ||
            (getDistant(a, b) + getDistant(c, b) <= getDistant(a, c)) ||
            (getDistant(c, b) + getDistant(c, a) <= getDistant(a, b)))
            System.out.println("Dots form a triangle");
        else System.out.println("Dots do not form a triangle");
    }


}
