package com.project;
import javafx.util.Pair;

import java.awt.*;
import java.util.Random;

public class Matrix {
    int n, m;
    double[][] array;

    Matrix()
    {
        this(10);
    }

    Matrix(int n)
    {
        this(n,n);
    }

    Matrix(int n, int m)
    {
        this.n = n;
        this.m = m;
        this.array = new double[n][m];
    }

    public int getStringNumber()
    {
        return this.n;
    }

    public int getColumnNumber()
    {
        return this.m;
    }

    public void setAllArrayItems()
    {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                array[i][j]=NumericScanner.scanDouble();
            }
        }
    }
///////////////////////////////////////////////
    public void setRandomArrayItems()
    {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                array[i][j]=new Random().nextDouble();
            }
        }
    }

    public void printArray()
    {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.printf("arr[%d][%d] = %5.2f\t", i, j, array[i][j]);
            }
            System.out.println();
        }
    }



    public double findMinValue() {

        double min = Double.MAX_VALUE;
        for(double[] a : array) {
            for(double i : a) {
                if (i < min) min = i;
            }
        }
        return min;
    }

    public double findMaxValue() {

        double max = Double.MIN_VALUE;
        for(double[] a : array) {
            for(double i : a) {
                if (i > max) max = i;
            }
        }
        return max;
    }

    public double findArithmeticalMean() {
        double arMean = 0;
        for(double[] a : array) {
            for(double i : a) {
                arMean += i;
            }
        }
        arMean /= (getStringNumber() * getColumnNumber());
        return arMean;
    }

    public double findGeometricalMean() {
        double geMean = 0.0d;
        for(double[] a : array) {
            for(double i : a) {
                if (i == 0.0d) {
                    return 0.0d;
                }
                geMean += Math.log(i);
            }
        }
        geMean = Math.exp(geMean/(getStringNumber() * getColumnNumber()));
        return geMean;
    }


    private boolean isLocalMinimum(int i, int j) {
        boolean result = true;
        for (int k = i - 1; k <= i + 1; k++) {
            if (k == -1 || k == getStringNumber()) {
                continue;
            }
            for (int m = j - 1; m <= j + 1; m++) {
                if (m == -1 || m == getColumnNumber() || (m == j && k == i)) {
                    continue;
                }
                if (array[i][j] > array[k][m]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private boolean isLocalMaximum(int i, int j) {
        boolean result = true;
        for (int k = i - 1; k <= i + 1; k++) {
            if (k == -1 || k == getStringNumber()) {
                continue;
            }
            for (int m = j - 1; m <= j + 1; m++) {
                if (m == -1 || m == getColumnNumber() || (m == j && k == i)) {
                    continue;
                }
                if (array[i][j] < array[k][m]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    public PositionPair<Integer> findPositionOfLocalMinimum() {
        for (int i = 0; i < getStringNumber(); i++) {
            for (int j = 0; j < getColumnNumber(); j++) {
                if (isLocalMinimum(i, j)) {
                    return new PositionPair<>(i, j);
                }
            }
        }
        return new PositionPair<>(-1, -1);
    }

    public PositionPair<Integer> findPositionOfLocalMaximum() {
        for (int i = 0; i < getStringNumber(); i++) {
            for (int j = 0; j < getColumnNumber(); j++) {
                if (isLocalMaximum(i, j)) {
                    return new PositionPair<>(i, j);
                }
            }
        }
        return new PositionPair<>(-1, -1);
    }

    public double[][] transposeMatrix()
    {
        for (int n = 0; n < n - 2; n++) {
            for (int m = n + 1; m < n - 1; m++) {
                array[n][m] += array[m][n];
                array[m][n] -= array[n][m];
                array[m][n] = - array[m][n];
                array[n][m] = array[n][m] - array[m][n];
            }
        }
        return array;
    }

}
