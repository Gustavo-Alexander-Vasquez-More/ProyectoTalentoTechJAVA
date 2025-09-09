package com.techlab.inicio.clase3;

/*
Creá un array de 5 productos.
Imprimí sus elementos y luego intentá agregar un sexto producto (analizá el resultado).
 */
public class Arrays {

  public static void main(String[] args) {
    String[] productos = new String[5];
    productos[0] = "Iphone 14";
    productos[1] = "Huawei P9";
    productos[2] = "Sansumg Galaxy S25";
    productos[3] = "Poco A03";
    productos[4] = "Moto G42";

    for (int i = 0; i < productos.length; i++) {
      System.out.println("Producto: " + productos[i]);
    }
    //Si intentamos cargar otro producto no nos dejará, ya que el arreglo es de tamaño estático.
    //No puede cambiarse el tamaño de un arreglo ya definido
  }
}
