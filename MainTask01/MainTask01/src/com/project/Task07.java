package com.project;

public class Task07 {
    int a, b;

    Task07(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void reverseNumbers()
    {
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
    }

    void displayNumbers() {
        System.out.printf("a = %d, b = %d\n", a, b);
    }
}
