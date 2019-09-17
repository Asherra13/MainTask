package com.project;

public class Task04 {
    private int dd, mm, yyyy;

    Task04(int dd, int mm, int yyyy)
    {
        if ((dd<=0)||(mm<=0)||(yyyy<=1582)) throw new IllegalArgumentException("Date should be > 0");
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    void displayInfoDay()
    {
        if (mm < 3) {
            --yyyy;
            mm += 10;
        } else
            mm -= 2;
        System.out.printf("Next day: %d",((dd + 31 * mm / 12 + yyyy + yyyy / 4 - yyyy / 100 + yyyy / 400) % 7));
    }

    void displayInfo()
    {
        //31 - 01, 03, 05, 07, 08, 10, 12
        //30 - 04, 09, 11
        //28 - 02

        int ndd = 1, nmm = mm, nyyyy = yyyy;

        if (mm == 2)
        {
            if ((yyyy % 4 == 0) && (yyyy % 100 != 0) || (yyyy % 400 == 0))
            {
                if (dd==29) {nmm = mm +1;}
                else ndd += dd;
            }
            else {
                if (dd==28) {nmm = mm +1;}
                else ndd+=dd;
                }
        }
        else if (mm == 12)
        {
            if (dd == 31) {nmm = 1; nyyyy = yyyy + 1;}
            else ndd+= dd;
        }
        else if ((mm==4)||(mm==9)||(mm==10))
        {
            if (dd == 30) {nmm = mm + 1;}
            else ndd+= dd;
        }
        else
        {
            if (dd == 31) {nmm = mm + 1;}
            else ndd+= dd;
        }

        System.out.printf("Next date will be %d/%d/%d", ndd, nmm, nyyyy);
    }
}
