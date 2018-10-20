package com.company;

import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    Scanner sc = new Scanner(System.in);

    static int Maximo(int a, int b, int c)
    {
        int max = a;

        if(b > a && b > c)
        {
            max = b;
        }
        else
        {
            if(a > b && a > c)
            {
                max = a;
            }
            else
            {
                max = c;
            }
        }
        return max;
    }

    static int Minimo(int a, int b, int c)
    {
        int min = a;

        if(b < a && b < c)
        {
            min = b;
        }
        else
        {
            if(a < b && a < c)
            {
                min = a;
            }
            else
            {
                min = c;
            }
        }
        return min;
    }

    static int Medio(int a, int b, int c)
    {
        int medio;
        if(a != Maximo(a,b,c) && a != Minimo(a,b,c))
        {
            medio = a;
        }
        else
        {
            if(b != Maximo(a,b,c) && b != Minimo(a,b,c))
            {
                medio = b;
            }
            else
            {
                medio = c;
            }
        }
        return medio;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c, medio;
        System.out.print("Primer nº: ");
        a = sc.nextInt();
        System.out.print("Segundo nº: ");
        b = sc.nextInt();
        System.out.print("Tercer nº: ");
        c = sc.nextInt();

        medio = Medio(a,b,c);
        System.out.println(medio);

    }

}

