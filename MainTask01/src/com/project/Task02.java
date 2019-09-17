package com.project;


public class Task02 {
    private double weight;

    Task02(double weight)
    {
        if(weight <= 0) {
            throw new IllegalArgumentException("Weight should be > 0");
        }
        this.weight = weight;
    }

    void displayMilligram()
    {
        System.out.printf("%.2f kg = %.2f mg\n", weight, 1000000 * weight);
    }

    void displayGram()
    {
        System.out.printf("%.2f kg = %.2f g\n", weight, 1000 * weight);
    }

    void displayTons()
    {
        System.out.printf("%.2f kg = %.2f t\n", weight, 0.001 * weight);
    }


}
