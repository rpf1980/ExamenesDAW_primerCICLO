package com.company;

public class Main
{

    static void Romboide(int altura, int longitud)
    {
        int espacios;
        int astericos;
        int j, l;

        espacios = altura - 1;
        for(j = altura; j > 0; j--)
        {
            astericos = longitud;

            for(l = 0; l < espacios; l++)
            {
                System.out.print(" ");
            }
            for(l = 0; l < astericos; l++)
            {
                System.out.print("*");
            }
            espacios--;

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int altura = 15;
        int longitud = 9;

        Romboide(altura, longitud);
    }
}

