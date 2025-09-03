package com.techlab.inicio.clase3;

public class ManipulacionCadenas {
  public static String formatear(String cadena){
    String palabra=cadena.toLowerCase().trim();
    String[] palabras=palabra.split(" ");
    StringBuilder sb= new StringBuilder();
    for(int i = 0; i < palabras.length; i++){ //Se ejecuta según la cantidad de palabras
      if(!palabras[i].isEmpty()){ //Verifica que la Palabra no esté vacía
        sb.append(Character.toUpperCase(palabras[i].charAt(0))) //Convierte el primer carácter en mayúscula
            .append(palabras[i].substring(1)) //obtiene el resto de caracteres de la palabra
              .append(" "); //Agrega un espacio al final de cada palabra y al final toda la palabra se concatena.
      }
    }
    return sb.toString().trim(); //se borra el espacio final y todas las palabras se concatenan retornando un solo string.
  }
  public static void main(String[] args) {
    String cadena=" té CHAi ";
   //Tenemos que formatearla para que quede en formato "Title Case"
    String cadenaFormateada=formatear(cadena);
    System.out.println(cadenaFormateada);
    //Mostrar la longitud de la cadena
    System.out.println(cadenaFormateada.length());
    //Mostrar la primera letra
    System.out.println(cadenaFormateada.charAt(0));
    //Verificar si existe la palabra "Chai"
    if(cadenaFormateada.contains("Chai")){
      System.out.println("Si existe");
    }else{
      System.out.println("No existe");
    }
  }
}
