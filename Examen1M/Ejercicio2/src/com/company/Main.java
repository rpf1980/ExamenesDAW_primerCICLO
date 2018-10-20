package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int n1 = 0, n2 = 0, n3 = 0;

        while(!(n1 >= 1 && n1 <= 100))
        {
            System.out.print("Escribe primer número: ");
            n1 = sc.nextInt();
        }
        while(!(n2 > n1 && n2 >= 1 && n2 <= 100))
        {
            System.out.print("Escribe segundo número: ");
            n2 = sc.nextInt();
        }
        while(!(n3 > n1 && n3 < n2 && (n3 >= 1 && n3 <= 100)))
        {
            System.out.print("Escribe tercer número: ");
            n3 = sc.nextInt();
        }

        for(i = n1; i <= n3; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = n3; i <= n2; i++)
        {
            System.out.print(i + " ");
        }

    }
}
