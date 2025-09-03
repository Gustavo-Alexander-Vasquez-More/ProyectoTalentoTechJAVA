package com.techlab.inicio.clase3;
import java.util.ArrayList;
/*Tené una lista de productos con nombres desprolijos.
Creá un método que recorra la lista y aplique el formateo a cada nombre, volviendo a imprimir la lista con nombres prolijos.
*/
public class Listas {

  public static ArrayList<String> formatear(ArrayList<String> lista){
    int sizeList=lista.size(); //Primero pregunto el tamaño de la lista
    for (int i=0; i < sizeList; i++){
      StringBuilder sb= new StringBuilder();
      String producto=lista.get(i).toLowerCase().trim(); //En cada recorrido accede de acuerdo a su índice y lo pasamos a minúscula y sacamos los espacios que pueda tener
      String[] palabra=producto.split(" ");
      for (int j =0; j < palabra.length; j++){ //recorre para palabra del string según su posición en la lista
        if(!palabra[j].isEmpty()) {
          sb.append(Character.toUpperCase(palabra[j].charAt(0)))
              .append(palabra[j].substring(1))
              .append(" ");
        }
      }
      lista.set(i, sb.toString().trim());
    }
    return lista;
  }
  public static void main(String[] args) {
    ArrayList<String> lista=new ArrayList<>();
    lista.add("iphonE 14");
    lista.add("HuaWeI P9");
    lista.add("saNsUmg GalAxy S25");
    lista.add("POcO A03");
    lista.add("motO g42");
    ArrayList<String> productosFormateados = formatear(lista);
    System.out.println(productosFormateados);
  }
}
