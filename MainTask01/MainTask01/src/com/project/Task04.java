package com.project;

public class Task04 {
    int n;
    byte n1, n2, n3, n4;

    Task04(int n)
    {
        if (String.valueOf(Math.abs(n)).length() != 4) throw new IllegalArgumentException("Digital should be XXXX");

        this.n = n;
        n1 = (byte)(getNthDigit(n,10,1));
        n2 = (byte)(getNthDigit(n,10,2));
        n3 = (byte)(getNthDigit(n,10,3));
        n4 = (byte)(getNthDigit(n,10,4));
    }

    private int getNthDigit(int number, int base, int n) {
        return (int) ((number / Math.pow(base, n - 1)) % base);
    }

    void displayInfo() {
        if ((n1>n2) & (n2>n3) & (n3>n4)) System.out.printf("Decreasing sequence\n");
        else if ((n1<n2) & (n2<n3) & (n3<n4)) System.out.printf("Increasing sequence\n");
        else System.out.printf("The sequence neither increases nor decreases\n");
    }
}
