package com.company;

import java.util.Scanner;

public class Main
{

    static void DescomponFactoresPrimos(int n)
    {
        int div = 2;
        int i;

        for(i = 0; i <= n; i++)
        {
            if(n %div == 0)
            {
                System.out.print(div + "x");
                n = n / div;
            }
            else
            {
                div++;
            }
        }
        System.out.print("\b");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Escribe un número: ");
        n = sc.nextInt();

        System.out.print(n + " = ");
        DescomponFactoresPrimos(n);
    }
}

