package com.techlab.inicio.clase4;

import java.lang.reflect.Array;

public class Parametros_Argumentos {

  public static double calcularDescuento(double precioTotal, double descuento) {
    double diferencia = (precioTotal * descuento) / 100;
    return precioTotal - diferencia;
  }

  public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
    double precioTotal = precio * cantidad;
    if (cantidad > 50) {
      return calcularDescuento(precioTotal, descuento + 5); //aumento 5 porciento de descuento
    } else {
      return calcularDescuento(precioTotal, descuento);
    }
  }

  public static void reponerStock(int indice, int[] stock) {
    stock[indice] = stock[indice] + 5;
  }

  public static void main(String[] args) {
    /*Creá un método calcularPrecioFinal que reciba el precio, el descuento y la cantidad.
    Si la cantidad es mayor a 50, aumentá el descuento. Imprimí el resultado.
    */
    System.out.println("El precio final con descuento es de: $" + calcularPrecioFinal(50.20, 15,
        60)); //con descuento extra
    System.out.println("El precio final con descuento es de: $" + calcularPrecioFinal(50.20, 15,
        20)); //sin descuento extra
    //Definí un array con el stock de 3 productos.
    int[] stock = new int[3];
    stock[0] = 1;
    stock[1] = 5;
    stock[2] = 2;
    //Escribí un método reponerStock que sume unidades a un índice específico del array.
    //Mostrá el stock antes y después de la reposición.
    System.out.println(stock[2]);
    reponerStock(2, stock);
    //después de modificarlo:
    System.out.println(stock[2]);
  }
}
