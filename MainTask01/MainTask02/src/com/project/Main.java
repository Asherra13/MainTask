package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            Point a = new Point(1,2);
            Point b = new Point(4,2);
            Point c = new Point(2,6);

            Task01 t01 = new Task01(a, b, c);
            t01.displayInfo();

            Task02 t02 = new Task02(100);
            t02.displayHeadNumber();

            Task03 t03 = new Task03('c');
            t03.displayInfo01();
            t03.displayInfo02();
            t03.displayInfo03();
            t03.displayInfo04();

            Task04 t04 = new Task04(11,12,2018);
            t04.displayInfo();

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
