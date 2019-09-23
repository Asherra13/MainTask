package com.project;

public class Task03 {
    char c;

    Task03(char c)
    {
        this.c = c;
    }

    void displayInfo01()
    {
        long x = (long)(Character.toUpperCase(c)) - 64;
        if (x*x*x*x*x - 51*x*x*x*x + 914*x*x*x - 6894*x*x + 20205*x - 14175 == 0)
            System.out.printf("%c is Vowel\n", c);
        else System.out.printf("%c is not Vowel\n", c);
    }

    void displayInfo02()
    {
        String patern = "AEIOU";

        if (patern.contains(Character.toString(Character.toUpperCase(c))))
            System.out.printf("%c is Vowel\n", c);
        else System.out.printf("%c is not Vowel\n", c);
    }
    void displayInfo03()
    {
        char c1 = Character.toUpperCase(c);
        if ((c1=='A')||(c1=='E')||(c1=='I')||(c1=='O')||(c1=='U'))
            System.out.printf("%c is Vowel\n", c);
        else System.out.printf("%c is not Vowel\n", c);
    }
    void displayInfo04()
    {
        String s1 = Character.toString(Character.toUpperCase(c));

        if (s1.matches("^(?i:[aeiouy]).*"))
            System.out.printf("%c is Vowel\n", c);
        else System.out.printf("%c is not Vowel\n", c);
    }
}
