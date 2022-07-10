package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextInt();
        double precioConIva = getPrecio(precio);
        System.out.println("El precio del producto con IVA es: €" + precioConIva);

    }

    private static double getPrecio(double precio) {
        return precio * 1.18;
    }
}
