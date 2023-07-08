package com.bicoserus;

import java.util.Scanner;

public class funciones {

      //funcion para calcular iva + valor
    public static double calcuIVA(double p){
        double IVA;
        IVA = p * 21/100+p;
        return IVA;
    }

    public static void main(String[] args){




        Scanner lector = new Scanner(System.in);

        double precio, IVA;

        System.out.println("ingrese el precio total de la compra: ");

        precio = lector.nextDouble();

        IVA = calcuIVA(precio);

            //imprimo valores

        System.out.println("el precio sin IVA "+precio);
        System.out.println("valor del iva mas el valor del producto : "+IVA+precio);

                }
        }