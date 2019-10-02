package com.project;

import javafx.geometry.Pos;

public class TaskSolution {
    public static void startSolution()
    {
        Matrix matrix;
        int mstrings, mcolumns;
        double min, max;
        double arithmean, geommean;
        PositionPair<Integer> localminposition, localmaxposition;

        System.out.print("Please, enter number of matrix strings ");
        mstrings = NumericScanner.scanPositiveInt();

        System.out.print("Please, enter number of matrix columns ");
        mcolumns = NumericScanner.scanPositiveInt();

        matrix = new Matrix(mstrings, mcolumns);
        //matrix.setAllArrayItems();
        matrix.setRandomArrayItems();
        matrix.printArray();

        min = matrix.findMinValue();
        max = matrix.findMaxValue();

        System.out.printf("Minimum in matrix is %5.2f, maximum is %5.2f\n", min, max);

        arithmean = matrix.findArithmeticalMean();
        geommean = matrix.findGeometricalMean();

        System.out.printf("Arithmetical mean is %5.2f, geometrical mean is %5.2f\n", arithmean, geommean);

        localminposition = matrix.findPositionOfLocalMinimum();
        localmaxposition = matrix.findPositionOfLocalMaximum();

        System.out.print(findLocalExtr(localminposition, localmaxposition));

        matrix.transposeMatrix();

        System.out.println("Matrix after transpose: ");
        matrix.printArray();


    }

    private static String findLocalExtr(PositionPair<Integer> lmin, PositionPair<Integer> lmax)
    {
        String result = "x";
        if (lmin.getItem1() == -1){
            result += "no local minimum (function returns " + lmin.getItem1() + ") \n";
        }
        else{
            result += "first local minimum position is [" + lmin.getItem1() + "][" + lmin.getItem2() + "]\n";
        }
        if (lmax.getItem1() == -1){
            result += "no local maximum (function returns " + lmax.getItem1() + ")\n";
        }
        else{
            result += "first local maximum position is [" + lmax.getItem1() + "][" + lmax.getItem2() + "]\n";
        }

         return result;
    }
}
