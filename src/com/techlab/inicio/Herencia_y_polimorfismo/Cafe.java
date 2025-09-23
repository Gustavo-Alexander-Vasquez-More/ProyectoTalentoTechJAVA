package com.techlab.inicio.Herencia_y_polimorfismo;

public class Cafe extends Producto{
  private boolean caliente;
  private boolean molido;
  private String origen;
  public Cafe(String nombre, double precio, int cantidad, boolean caliente, String origen, boolean molido){
    super(nombre, precio, cantidad);
    this.caliente=caliente;
    this.origen=origen;
    this.molido=molido;
  }
  @Override
  public double calcularPrecioFinal() {
    if(molido){
      return getPrecio() * getCantidad() + 500; //le sumamos 500 si es molido por el trabajo extra
    }else{
      return getPrecio() * getCantidad(); //si se lo lleva en grano es más barato
    }
  }
}
