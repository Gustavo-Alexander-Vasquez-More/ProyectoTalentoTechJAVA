package com.techlab.inicio.Bucles_condicionales_variables;
import java.util.Scanner;
public class entradaSalida {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double precio= 20.00;
    System.out.println("Ingrese su nombre");
    String nombre = sc.nextLine();
    System.out.println("Ingrese la cantidad de productos que desea comprar");
    int cantidadDeseada=sc.nextInt();
    System.out.println("Hola " + nombre + " deberás pagar un monto de $" + (precio * cantidadDeseada));
  }
}
