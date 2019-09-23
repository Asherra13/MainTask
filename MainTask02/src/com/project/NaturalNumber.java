package com.project;

import java.util.Random;
import java.lang.Math;

public class NaturalNumber {
    private int number;

    private enum CoinState {
        Heads,
        Tails
    }

    NaturalNumber(int n)
    {
        this.number = n;
    }

    public int getNumber()
    {
        return this.number;
    }

    public newPair<Integer> countHeadsTails()
    {
        int nHeads = 0;

        for (int i = 0; i<number; i++)
        {
            if (flipCoin() == CoinState.Heads){
                nHeads++;
            }
        }

        return new newPair<Integer>(nHeads, number - nHeads);
    }

    public int findGreatestDigit()
    {
        return  findGreatestDigit(number);
    }

    private int findGreatestDigit(int n)
    {
        return n == 0 ? 0 :
                Math.max(n % 10, findGreatestDigit(n / 10));
    }

    public  boolean isPalindrome()
    {
        return isPalindrome(number);
    }

    private boolean isPalindrome(int n)
    {
        int nLength = countsOfDigits(n);
        int fDigit = firstDigit(n);
        int lDigit = lastDigit(n);

        if (nLength<=1){
            return true;
        }
        else{
            return fDigit == lDigit && (isPalindrome((int)(n % Math.pow(10, nLength-1) - lDigit) / 10));
        }

    }

    public boolean isSimple()
    {
        return isSimple(number, 2);
    }

    private boolean isSimple(int number, int i)
    {
        if (number == 1) return false; // 1 - не простое число
        if (number == 2) return true; // особый случай

        if (number % i == 0) return false;

        if(i <= Math.sqrt(number)) // проверяем не все делители а только до корня квадратного из числа
            return isSimple(number, i + 1);
        else return true;
    }

    public  void returnSimpleFactors()
    {
        returnSimpleFactors(number, 2);
    }

    private void returnSimpleFactors(int n, int i)
    {
        if(n==1)
            return;
        for(;;i++)
            if(n%i==0)
            {
                System.out.print(i + " ");
                returnSimpleFactors(n/i, i);
                return;
            }
    }

    public int finfLeastCommonMltiple(NaturalNumber n)
    {
        return finfLeastCommonMltiple(this.getNumber(), n.getNumber());
    }

    private int finfLeastCommonMltiple(int a, int b)
    {
        return a / findGreatestCommonDivisor(a,b) * b;
    }

    public int findGreatestCommonDivisor(NaturalNumber n)
    {
        return findGreatestCommonDivisor(this.getNumber(), n.getNumber());
    }

    private int findGreatestCommonDivisor(int a, int b){
        return b == 0 ? a : findGreatestCommonDivisor(b,a % b);
    }

    private int findNum(int n) {
        int shf = 0;

        if(n < 0)
            n = 0 - n;

        while(n != 0){
            shf |= 1 << (n % 10);
            n   /= 10;
        }
        return shf;
    }

    public int countUniqueDigits()
    {
        int uniqueD = 0;
        int shf = findNum(number);
        for(int i = 0; i <= 9; ++i){
            if(((shf >> i) & 1) == 1){
                uniqueD++;
            }
        }
        return  uniqueD;
    }



    public boolean isPerfect() {
        int summa =0;
        for(int i=1;i<number;i++) {
            if(number%i==0) summa+=i;
        }
        return summa == number;
    }

    public void displayAmicableNumbers(NaturalNumber m)
    {
        displayAmicableNumbers(this.getNumber(), m.getNumber());
    }

    private  void displayAmicableNumbers(int min, int max)
    {
        int num, num2, num3;
        for (int num1 = min; num1<=max; num1++)
        {
            num2 = sumOfDivisors(num1);
            if (num1 < num2)
            {
                num3 = sumOfDivisors(num2);
                if (num3 == num1)    /* FOUND AN AMICABLE PAIR! */
                    System.out.printf("Friendly numbers: a = %d b = %d\n", num3, num2);
            }
        }
    }

    private int sumOfDivisors(int n)
    {
        int sum=0,i;
        for(i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    private CoinState flipCoin(){
        return new Random().nextBoolean() ? CoinState.Heads: CoinState.Tails;
    }

    private int countsOfDigits(int number) {
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    private int firstDigit(int n)
    {
        if(n / 10 == 0)
            return n;
        return firstDigit(n / 10);

    }

    private  int lastDigit(int n)
    {
        return n % 10;
    }
}
