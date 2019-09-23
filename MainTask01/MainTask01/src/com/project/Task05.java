package com.project;

public class Task05 {
    int n;

    Task05(int n)
    {
        if (String.valueOf(Math.abs(n)).length() != 6) throw new IllegalArgumentException("Digital should be XXXXXX");
        this.n = n;
    }

    private int getNthDigit(int number, int base, int n) {
        return (int) ((number / Math.pow(base, n - 1)) % base);
    }

    void displayArithmeticMean() {
        double arMean = 0;

        for (int i = 1; i<=String.valueOf(Math.abs(n)).length(); i++)
            arMean += (getNthDigit(n,10,i));
        arMean /= String.valueOf(Math.abs(this.n)).length()*1.0;

        System.out.printf("Arithmetic mean of digits from number %d is %.2f\n", this.n, arMean);
    }

    void displayGeometricMean() {
        double geoMean = 1;

        for (int i = 1; i<=String.valueOf(Math.abs(n)).length(); i++)
        geoMean *= (getNthDigit(n,10,i));
        geoMean = Math.pow(geoMean, 1d/String.valueOf(Math.abs(n)).length());

        System.out.printf("Arithmetic mean of digits from number %d is %.2f\n", this.n, geoMean);
    }
}
