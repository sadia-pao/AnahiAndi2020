package com.mycompany.anahiandi2020;

import java.util.Scanner;

public class AnahiAndi2020 {

    public static void main(String[] args) {

        float[] ventas = new float[7];
        Scanner teclado = new Scanner(System.in);

        float totalVentas = 0;
        float promedioDiario = 0;

        float datos = 0;
        int con = 0;

        do {
            System.out.println("ingrese la camtidad de ventas");
            datos = teclado.nextFloat();

            if (datos > 0) {
                int i = 0;
                ventas[i] = datos;
                con = con + 1;

            } else {
                System.out.println("el valor es incorrecto");

            }

        } while (con < 7);

        System.out.println("Eliga las opciones del 1 al 4");
        System.out.println("1-Calcular el total de ventas");
        System.out.println("2-Calcular el dia de ventas màs cercanas al promedio");
        System.out.println("3-Mostrar el dia con la venta mas alta y el dia con la venta mas baja");
        System.out.println("4-Calcular el monto acumulado de ventas durante los primeros tres dias y los ultimos tes dias");
        System.out.println("salir");

        int opciones = teclado.nextInt();
        switch (opciones) {
            case 1:
               
                for (int i = 0; i < 7; i++) {
                    totalVentas = ventas[i]+totalVentas;
                    
                }
                float total=totalVentas/7;
                System.out.println("Total de ventas:"+total);
                break;
                
            case 2:
                float promedio=totalVentas/7;
                
                        
                        
                        
                        
            case 3:
            case 4:
            case 5:
                
                
               

        }

    }

}
