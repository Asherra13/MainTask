package com.project;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.reflect.Type;

public class NumericScanner {

    private static String scanNumber()
    {
        Scanner in = new Scanner(System.in);
        String input;

        while (true) {
            input = in.next();
            if (isNumeric(input)) {
                return input;
            }
            else{
                System.out.println("Input is not a number, try again");
            }
        }
    }

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isNumeric(String str)
    {
        str = str.replace(",", ".");
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public static int scanPositiveInt()
    {
        while (true) {
            try {
                int n = Integer.parseInt(scanNumber());
                if (n>0){
                    return n;
                }
                else{
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println("Input is not a positive integer number, try again");
            }
        }
    }

    public static double scanDouble()
    {
        double n = Double.parseDouble(scanNumber());
        return n;
    }
}

