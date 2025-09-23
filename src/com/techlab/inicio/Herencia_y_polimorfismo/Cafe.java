package com.techlab.inicio.Herencia_y_polimorfismo;

public class Cafe extends Producto{
  private boolean caliente;
  private String origen;
  public Cafe(String nombre, double precio, int cantidad, boolean caliente, String origen){
    super(nombre, precio, cantidad);
    this.caliente=caliente;
    this.origen=origen;
  }
  @Override
  public double calcularPrecioFinal() {
    return getPrecio() * getCantidad();
  }

}
