package com.techlab.inicio.clase2;
import java.util.Scanner;
public class bucles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número por favor");
    int num = sc.nextInt();
    for(int i = 1; i <= num; i++){
      System.out.println(i);
    }
  }
}
