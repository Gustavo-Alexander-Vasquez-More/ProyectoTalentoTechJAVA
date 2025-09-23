package com.techlab.inicio.Herencia_y_polimorfismo;

public class Te extends Producto {
  private boolean caliente;

  public Te(String nombre, double precio, int cantidad, boolean caliente){
    super(nombre, precio, cantidad);
    this.caliente=caliente;
  }
  @Override
  public double calcularPrecioFinal() {
    return getPrecio() * getCantidad();
  };
  public static void main(
      String[] args) {

  }
}
