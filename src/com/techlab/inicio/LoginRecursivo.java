package com.techlab.inicio;
import java.util.Scanner;

public class LoginRecursivo {

  public static void verificarRecursivo(int intentos, Scanner sc){
    String user="root";
    String password="admin123";
    int maxIntentos=3;
    System.out.println("Intento N° "+ intentos);
    System.out.println("Ingrese su nombre de usuario");
    String inputUser=sc.next();
    System.out.println("Ingrese su contraseña");
    String inputPassword=sc.next();
    if((user.equals(inputUser)) && (password.equals(inputPassword))){
      System.out.println("Bienvenido");
    }else if(intentos >= maxIntentos){
      System.out.println("Has agotado el maximo de intentos de sesión, contacta al administrador.");
      System.exit(0);
    }else{
      System.out.println("Credenciales incorrectas, intente nuevamente");
        verificarRecursivo(intentos + 1, sc);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Tenés maximo 3 intentos para loguearte");
    verificarRecursivo(1, sc);
    sc.close();
  }
}
