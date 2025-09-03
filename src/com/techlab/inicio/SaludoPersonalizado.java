package com.techlab.inicio;
import java.util.Scanner;
public class SaludoPersonalizado {
  public static void main(String[] args) {
    System.out.println("Benvenidos a mi proyeto ecomerce con JAVA");
    Scanner sc = new Scanner(System.in); //Primero necesitamos crear un objeto Scanner
    System.out.println("Ingrese su edad par saber si puede ingresar al bar:");
    int edad = sc.nextInt();
  }
}
