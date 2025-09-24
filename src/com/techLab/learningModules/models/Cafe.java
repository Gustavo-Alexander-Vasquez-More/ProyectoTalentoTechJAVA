package com.techLab.learningModules.models;

import com.techLab.learningModules.services.Descontable;

public class Cafe extends Producto implements
    Descontable {
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

  @Override
  public double aplicarDescuento(double porcentaje) {
    double diferencia=(calcularPrecioFinal() * porcentaje)/100;
    return calcularPrecioFinal() - diferencia;
  }
}
