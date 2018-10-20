package com.company;

public class Main
{
    static void Cuadrado(int lado)
    {
        char asterisco = '*';

        for(int i = 0; i < lado; i++)
        {
            for(int j = 0; j < lado; j++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int lado = 5;
        Cuadrado(lado);
    }
}
