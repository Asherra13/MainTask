package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {

            Task01 t01 = new Task01(0, 1, 1);
            t01.displayInfo();

            Task02 t02 = new Task02(300000000);
            t02.displayMilligram();
            t02.displayGram();
            t02.displayTons();

            Task03 t03 = new Task03(9, 2);
            t03.displayRingArea();

            Task04 t04 = new Task04(9815);
            t04.displayInfo();

            Task05 t05 = new Task05(566837);
            t05.displayArithmeticMean();
            t05.displayGeometricMean();

            Task07 t07 = new Task07(111, 222);
            t07.displayNumbers();
            t07.reverseNumbers();
            t07.displayNumbers();

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
