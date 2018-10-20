package com.company;

import javax.lang.model.util.ElementScanner6;

public class Main
{

    static void EscribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < a.length-1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length-1] + "]");
    }

    static void IntercambiaParImpar(int[] a)
    {
        int[] arrayPares, arrayImpares;
        int par = 0, impar = 0;
        int i,j,k;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] %2 == 0)
            {
                par += 1;
            }
            else
            {
                impar += 1;
            }
        }

        arrayPares = new int[par];
        arrayImpares = new int[impar];

        j = 0;
        for(k = 0; k < a.length; k++)
        {
            for(i = 0; i < arrayPares.length; i++)
            {
                for(j = 0; j < arrayImpares.length; j++)
                {
                    if(a[k] %2 != 0)
                    {
                        a[i] = arrayPares[i] + arrayImpares[j];
                    }
                    else
                    {
                        a[i] = arrayImpares[j] + arrayPares[i];
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6};
        EscribeArray(a);
        System.out.println();
        IntercambiaParImpar(a);
        EscribeArray(a);


    }
}

