package com.techlab.inicio.Bucles_condicionales_variables;
import java.util.Scanner;
public class bucles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número por favor");
    int num = sc.nextInt();
    int cont=1;

    for(int i = 1; i <= num; i++){
      System.out.println(i);
    }
    //Repetir lo mismo pero con un while
    while(cont <= num){
      System.out.println(cont);
      cont ++;
    }
  }
}
