package com.project;

public class Task02 {
    private int n;

    Task02(int n)
    {
        if (n<=0) throw new IllegalArgumentException("Age should be > 0");
        this.n = n;
    }

    void displayHeadNumber()
    {
        long h = 3;
        if (n>300) h += (n - 300) + 800;
        else if (n>100) h += (n - 200)*2 + 600;
        else h += n*3;

        System.out.printf("In %d years dragon will have %d heads\n", n, h);
    }
}
