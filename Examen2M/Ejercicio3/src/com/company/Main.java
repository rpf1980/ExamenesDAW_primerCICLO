package com.company;

public class Main
{

    public static boolean CompruebaTarjeta(int[] a)
    {
        boolean valida = false;
        int i;
        int calculo = 1;
        int suma = 0;

        if(a.length == 16)
        {
            for(i = 0; i < a.length; i++)
            {
                if(i %2 == 0)
                {
                    calculo = i * 2;

                    while(calculo > 10)
                    {
                        calculo = calculo - 9;
                    }
                    suma = suma + calculo;
                }

            }
            if(suma %10 == 0)
            {
                valida = true;
            }
        }
        else
        {
            System.out.println("Error. La cantidad de dígitos de la tarjeta no es correcta.");
        }
        return valida;
    }

    public static void main(String[] args)
    {
        int[] array = {5,5,6,5,8,6,6,6,4,5,2,2,7,3,0,9};
        boolean valida;

        valida = CompruebaTarjeta(array);
        System.out.println("TARJETA = " + valida);
    }
}

