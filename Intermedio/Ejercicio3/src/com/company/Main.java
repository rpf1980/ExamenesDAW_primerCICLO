package com.company;

import java.util.List;
import java.util.Scanner;

public class Main
{

    static boolean CuadradoPerfecto(int n)
    {
        boolean perfecto = false;
        int i;
        for(i = 0; i <= n; i++)
        {
            if(i * i == n)
            {
                perfecto = true;
            }
        }
        return perfecto;
    }

    static void ListaCuadradosPerfectos(int min, int max)
    {
        int i;
        for(i = min; i <= max; i++)
        {
            if(CuadradoPerfecto(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*int n;
        boolean perfecto;

        System.out.println("Escribe un número para decirte si es un cuadrado perfecto: ");
        n = sc.nextInt();

        perfecto = CuadradoPerfecto(n);
        System.out.println(perfecto);*/


        int min, max;
        System.out.print("Escribe número de incio: ");
        min = sc.nextInt();
        System.out.print("Escribe número de fin: ");
        max = sc.nextInt();

        ListaCuadradosPerfectos(min, max);
    }
}

