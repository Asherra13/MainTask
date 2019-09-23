package com.project;

public class Task03 {
    double r1, r2;

    Task03(double r1, double r2){
        if (r1<=0 || r2<=0 ) throw new IllegalArgumentException("Radius should be > 0");
        else if (r1<=r2) throw new IllegalArgumentException("Radius R1 should be > R2");
        this.r1 = r1;
        this.r2 = r2;
    }

    void displayRingArea()
    {
        System.out.printf("Ring Area = %.2f\n", (Math.sqrt(this.r1) - Math.sqrt(this.r2))*Math.PI);
    }

}
