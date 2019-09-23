package com.project;
import java.util.Scanner;

public class NewScanner {
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

}
