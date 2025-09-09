package com.techlab.inicio.clase3;
import java.util.ArrayList;
/*Tené una lista de productos con nombres desprolijos.
Creá un método que recorra la lista y aplique el formateo a cada nombre, volviendo a imprimir la lista con nombres prolijos
*/
public class Listas {

  public static String formatearElemento(String elemento){
    String cadena=elemento.toLowerCase();
    String[] palabras=cadena.split(" "); //objecto de palabras un elemento de la lista
    StringBuilder sb= new StringBuilder();
    for(int i=0; i < palabras.length; i++){
      if(!palabras[i].isEmpty()){
        sb.append(Character.toUpperCase(palabras[i].charAt(0))) //convierte el primer caracter en mayucula
            .append(palabras[i].substring(1))
            .append(" ");
      }
    }
    return sb.toString().trim();
  }
  public static void formateoListas(ArrayList<String> lista){
    for(int i=0; i < lista.size(); i++){
      lista.set(i, formatearElemento(lista.get(i)));
    }
  }

  public static void main(String[] args) {
    ArrayList<String> lista=new ArrayList<>();
    lista.add("iphonE 14");
    lista.add("HuaWeI P9");
    lista.add("saNsUmg GalAxy S25");
    lista.add("POcO A03");
    lista.add("motO g42");
    formateoListas(lista);
    System.out.println(lista);
  }
}
