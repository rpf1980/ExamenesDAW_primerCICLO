package com.company;

import java.util.Scanner;

public class Main
{

    static void EscribeFechaBonita(int dia, int mes, int anio)
    {
        if(dia > 31 && mes > 12)
        {
            System.out.println("Fecha no válida");
        }
        else
        {
            System.out.print(dia + "/" + mes + "/" + anio + " = " + " Día " + dia + " de " + MesEnTexto(mes) + " de " + anio);
        }
    }

    static String MesEnTexto(int n)
    {
        String mes = "";
        switch (n)
        {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
            case 7: mes = "Julio"; break;
            case 8: mes = "Agosto"; break;
            case 9: mes = "Septiembre"; break;
            case 10: mes = "Octubre"; break;
            case 11: mes = "Noviembre"; break;
            case 12: mes = "Diciembre"; break;
            default: mes = "El texto no corresponde con ningún mes del calendario"; break;
        }
        return mes;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*String mes = "";
        int n;
        System.out.print("Escribe el número del mes: ");
        n = sc.nextInt();

        mes = MesEnTexto(n);
        System.out.println(mes);*/

        int dia, mes, anio;
        System.out.println("Escribe fecha: ");
        System.out.print("Día: ");
        dia = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        anio = sc.nextInt();

        EscribeFechaBonita(dia, mes, anio);

    }
}
