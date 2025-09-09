package com.techlab.inicio.clase4;

public class Funciones {

  //Escribí un método calcularImpuesto que reciba un precio y un porcentaje de impuesto, y devuelva el precio final.
  public static double calcularImpuesto(double precio, double impuesto) {
    double diferencia = (precio * impuesto) / 100;
    double total = precio + diferencia;
    total = Math.round(total * 100.0) / 100.0; // redondea a 2 decimales
    return total;
  }

  public static void main(String[] args) {
    //Llamá al método desde main con distintos valores.
    System.out.println("Precio final: $" + calcularImpuesto(15.50, 15));
    System.out.println("Precio final: $" + calcularImpuesto(40, 100));
    System.out.println("Precio final: $" + calcularImpuesto(35.20, 30));
  }
}
