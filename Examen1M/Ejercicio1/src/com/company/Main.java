package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Muestra los años bisiestos del siglo XXI

        int i;
        for(i = 2001; i <= 2100; i++)
        {
            if(i %4 == 0 && ((i %100 != 0)||(i %400 == 0)))
            {
                System.out.println(i);
            }
        }
    }
}
