package com.project;

public class Task06 {
    long n;
    Task06(long n)
    {
        this.n = n;
    }

    private int getNthDigit(long number, int base, int n) {
        return (int) ((number / Math.pow(base, n - 1)) % base);
    }

    void displayReverseNumber() {
        System.out.printf("%d = ", n);
        for (int i = 1; i<=String.valueOf(Math.abs(n)).length(); i++)
            System.out.print(getNthDigit(n,10,i));
    }
}
