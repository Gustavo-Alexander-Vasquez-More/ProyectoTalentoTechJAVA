package com.techlab.inicio.Herencia_y_polimorfismo;

public class Te extends Producto implements Descontable {
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

  @Override
  public double aplicarDescuento(double porcentaje) {
    double diferencia=(calcularPrecioFinal() * porcentaje)/100;
    return calcularPrecioFinal() - diferencia;
  }
}
