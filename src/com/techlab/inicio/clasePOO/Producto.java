package com.techlab.inicio.clasePOO;
//En la clase Producto, agrega un método mostrarInformacion() que imprima nombre, precio y stock.
public class Producto {
  double precio;
  String nombre;
  int stock;

  //MÉTODOS
  public void mostrarInformacion(){
    System.out.println(nombre);
    System.out.println(precio);
    System.out.println(stock);
  }
  public void calcularDescuento(){

  }

  public static void main(String[] args) {
    Producto producto=new Producto();
    producto.nombre="Café Latte";
    producto.precio=50.00;
    producto.stock=5;
    //LLAMAR AL MÉTODO DEL OBJETO PRODUCTO
    producto.mostrarInformacion();
  }
}
