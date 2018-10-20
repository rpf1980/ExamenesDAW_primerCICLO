package com.company;

public class Main
{

    public static void EscribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < a.length-1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length-1] + "]");
    }

    public static int[] CopiaArrayPro(int[] array)
    {
        int[] b = new int[array.length];
        int i, j;

        j = 0;
        for(i = 0; i < array.length; i++,j++)
        {
            b[j] = array[i];
        }
        return b;
    }

    public static int[] TailArray(int[] a, int n)
    {
        int[] b;
        int i;
        int j = 0;
        int k = a.length - n;

        if(n > a.length || n < 0)
        {
            System.out.println("ERROR");
            b = CopiaArrayPro(a);
        }
        else
        {
            b = new int[n];
            for(i = k; i < a.length; i++)
            {
                b[j] = a[k];
                j++;
                k++;
            }
        }
        return b;
    }

    public static void main(String[] args)
    {
        int[] array = {3,3,1,2,3,4,5};
        int n = 5;
        int[] b = new int[n];

        b = TailArray(array, n);
        EscribeArray(b);

    }
}
