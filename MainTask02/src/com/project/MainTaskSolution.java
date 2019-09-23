package com.project;

public class MainTaskSolution {

    public static  void playHeadsTailsGame()
    {
        System.out.print("Please, enter number of flips: ");
        int n = NewScanner.scanIntNumber();
        NaturalNumber nNumber = new NaturalNumber(n);
        newPair<Integer> counter = nNumber.countHeadsTails();
        System.out.printf("From %d flips it was %d heads and %d tails\n", n, counter.getItem1(), counter.getItem2());
    }

    public static void checkNumberTheory()
    {
        System.out.print("Please, enter first natural number: ");
        int a = NewScanner.scanIntNumber();
        NaturalNumber nNumber01 = new NaturalNumber(a);
        System.out.print("Please, enter second natural number: ");
        int b = NewScanner.scanIntNumber();
        NaturalNumber nNumber02 = new NaturalNumber(b);

        int maxD = nNumber01.findGreatestDigit();
        boolean isPalindrome = nNumber01.isPalindrome();
        boolean isSimple = nNumber01.isSimple();
        int lcm = nNumber01.finfLeastCommonMltiple(nNumber02);
        int gcd = nNumber01.findGreatestCommonDivisor(nNumber02);
        int nUniqueD = nNumber01.countUniqueDigits();

        System.out.printf("Max digit in number %d is %d\n", nNumber01.getNumber(), maxD);

        if (isPalindrome){
            System.out.printf("%d is palindrome\n", nNumber01.getNumber());
        }
        else {
            System.out.printf("%d is not palindrome\n", nNumber01.getNumber());
        }

        if (isSimple){
            System.out.printf("%d is simple number\n", nNumber01.getNumber());
        }
        else {
            System.out.printf("%d is not simple number\n", nNumber01.getNumber());
        }

        System.out.printf("Factors of number %d are ", nNumber01.getNumber());
        nNumber01.returnSimpleFactors();

        System.out.printf("\nLeast Common Multiple of numbers %d and %d is %d\n", nNumber01.getNumber(), nNumber02.getNumber(), lcm);
        System.out.printf("Greatest Common Divisor of numbers %d and %d is %d\n", nNumber01.getNumber(), nNumber02.getNumber(), gcd);

        System.out.printf("Number of unique digits in number %d is %d", nNumber01.getNumber(), nUniqueD);
    }

    public static void checkPerfection() {
        System.out.print("Please, enter first natural number: ");
        int a = NewScanner.scanIntNumber();
        NaturalNumber nNumber = new NaturalNumber(a);

        if (nNumber.isPerfect()){
            System.out.printf("%d is perfect\n", nNumber.getNumber());
        }
        else
        {
            System.out.printf("%d is not perfect\n", nNumber.getNumber());
        }


    }

    public static void findFriendlyNumbers() {
        System.out.print("Please, enter first natural number: ");
        int a = NewScanner.scanIntNumber();
        System.out.print("Please, enter second natural number: ");
        int b = NewScanner.scanIntNumber();
        NaturalNumber nNumber01;
        NaturalNumber nNumber02;

        if (a<=b){
            nNumber01 = new NaturalNumber(a);
            nNumber02 = new NaturalNumber(b);
        }
        else {
            nNumber01 = new NaturalNumber(b);
            nNumber02 = new NaturalNumber(a);
        }

        System.out.printf("Friendly numbers between %d and %d are \n", nNumber01.getNumber(), nNumber02.getNumber());
        nNumber01.displayAmicableNumbers(nNumber02);
    }

}
