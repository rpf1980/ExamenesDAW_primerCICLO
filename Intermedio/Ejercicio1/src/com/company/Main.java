package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double nota, suma, media;
        suma = 0;
        int i, suspensos;
        suspensos = 0;

        for(i = 0; i < 7; i++)
        {
            System.out.print("Escribe nota: ");
            nota = sc.nextInt();
            while(nota < 0 || nota > 10)
            {
                System.out.print("Escribe nota: ");
                nota = sc.nextInt();
            }
            suma = suma + nota;

            if(nota < 5)
            {
                suspensos = suspensos + 1;
            }
        }

        if(suspensos >= 2)
        {
            media = 4.0;
        }
        else
        {
            media = suma / 7.0;
        }

        System.out.println("Nota final = " + df.format(media));
    }
}
