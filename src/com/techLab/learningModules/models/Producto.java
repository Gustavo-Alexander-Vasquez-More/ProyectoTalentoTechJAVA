package com.techLab.learningModules.models;
import com.techLab.learningModules.exceptions.ProductoNoEncontradoException;
import com.techLab.learningModules.services.BuscarProductoService;
import java.util.ArrayList;

public abstract class Producto {
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

  public abstract double calcularPrecioFinal(); //Cada clase tiene distinta manera de calcular el precio por eso es abstracto

  public static void main(String[] args) {
    ArrayList<Producto> listaProductos=new ArrayList<>();
    listaProductos.add(new Te("Té negro", 15.50, 2, true));
    listaProductos.add(new Cafe("Café Express", 25.00, 10, true, "Brasilero", false));
    listaProductos.add(new Te("Té matcha", 5.50, 5, true));
    listaProductos.add(new Cafe("Café Express", 47.00, 50, true, "Peruano", true));

    for (Producto producto : listaProductos){
      if(producto instanceof Te){
        Te te=(Te) producto; //Polimorfismo: casteo del producto a te
        System.out.println(te.getNombre() + ": $" + te.calcularPrecioFinal());
        System.out.println("Precio con descuento del 15% $" + te.aplicarDescuento(15));
      }else if(producto instanceof Cafe){
        Cafe cafe=(Cafe) producto; //Polimorfismo: casteo del producto a te
        System.out.println(cafe.getNombre() + ": $" + cafe.calcularPrecioFinal());
        System.out.println("Precio con descuento del 30% $" + cafe.aplicarDescuento(30));
      }
    };
    //Manejo de excepciones
    //Con producto existente
    try{
      BuscarProductoService search=new BuscarProductoService(listaProductos.get(1).nombre);
      search.buscarProductoPorNombre("Café Express");
      System.out.println("Producto Encontrado");
    }
    catch(ProductoNoEncontradoException e){
      System.out.println(e.getMessage());
    }
    //Prueba con producto no existente
    try{
      BuscarProductoService search=new BuscarProductoService(listaProductos.get(1).nombre);
      search.buscarProductoPorNombre("Café Expreso");
      System.out.println("Producto Encontrado");
    }
    catch(ProductoNoEncontradoException e){
      System.out.println(e.getMessage());
    }
  }
}
