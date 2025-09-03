package com.techlab.inicio.clase2;
import java.util.Scanner;
public class condicionales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double precio=40.00;
    System.out.println("Ingrese su nombre");
    String nombre = sc.nextLine();
    System.out.println("Ingrese la cantidad de productos que desea comprar");
    int cantidadProductos = sc.nextInt();
    if(cantidadProductos > 100){
      System.out.println("Hola " + nombre + " aplicás a un descuento especial!");
    }else{
      System.out.println("Hola " + nombre + " deberás pagar un monto de $" + (precio * cantidadProductos));
    }
  }
}
