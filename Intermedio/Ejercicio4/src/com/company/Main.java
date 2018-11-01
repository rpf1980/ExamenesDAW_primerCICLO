package com.company;

import java.util.Scanner;

public class Main
{

    static void DescomponFactoresPrimos(int n)
    {
        int factor = 2;

        do
        {
            if(n %factor == 0)
            {
                System.out.print(factor + "x");
                n = n / factor;
            }
            else
            {
                factor++;
            }

        }while(factor <= n);

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

