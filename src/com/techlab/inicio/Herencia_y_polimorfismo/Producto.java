package com.techlab.inicio.Herencia_y_polimorfismo;

import java.util.ArrayList;

abstract class Producto {
 private String nombre;
 private double precio;
 private int cantidad;
 public Producto(String nombre, double precio, int cantidad){
   this.nombre=nombre;
   this.precio=precio;
   this.cantidad=cantidad;
 }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(
      String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(
      double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(
      int cantidad) {
    this.cantidad = cantidad;
  }

  public abstract double calcularPrecioFinal();

  public static void main(
      String[] args) {
    ArrayList<Producto> listaProductos=new ArrayList<>();
    listaProductos.add(new Te("Té negro", 15.50, 2, true));
    listaProductos.add(new Cafe("Café Express", 25.00, 10, true, "Perú"));
    System.out.println(listaProductos.get(1).calcularPrecioFinal());
  }
}
