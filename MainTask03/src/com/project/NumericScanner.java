package com.project;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.reflect.Type;

interface Transformer<I, O> {
    O transform(I input);
}


public class NewScanner<N extends Number>{

    Class typeOfTheScanner;

    NewScanner(Class<N> cl)
    {
        typeOfTheScanner = cl;
    }

    public N scanGenericNumber()
    {
        Scanner in = new Scanner(System.in);
        String input;

        while (true){
            input = in.next();
            if (isNumeric(input))
            {
                if (typeOfTheScanner == Integer.class)
                {

                }
                else
                {

                }
            }
            else
            {
                System.out.println("Input is not a number, try again");
            }

        }
    }
    /*
    public static int scanIntNumber()
    {
        Scanner in = new Scanner(System.in);
        int intInputValue = 0;
        String input;

        while (true) {
            input = in.next();
            try {
                intInputValue = Integer.parseInt(input);
                if (intInputValue > 0)
                {
                    return intInputValue;
                }
                else
                {
                    System.out.println("Input is not above zero, try again");
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("Input is not a number, try again");
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public double scanGenericNumber()
    {
        Scanner in = new Scanner(System.in);
        double intInputValue = 0;
        String input;

        while (true) {
            input = in.next();
            if (typeOfTheScanner == )
            try {
                intInputValue = Double.parseDouble(input);

                if (intInputValue > 0)
                {
                    return intInputValue;
                }
                else
                {
                    System.out.println("Input is not above zero, try again");
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("Input is not a number, try again");
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }



    public N myParse(String s, Transformer<String, N> transformer)
    {
        if (isNumeric(s)) {
            N elem = transformer.transform(s);
            return elem;
        }
        else
        {
            throw new InputMismatchException("Entered value is not a number");
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
*/
    private static boolean isNumeric(String str)
    {
        str = str.replace(",", ".");
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


}

