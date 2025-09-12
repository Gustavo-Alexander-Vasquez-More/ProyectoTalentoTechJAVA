package com.techlab.inicio.POO_I;

import com.techlab.inicio.POO_II.Carrito;

//En la clase Producto, agrega un método mostrarInformacion() que imprima nombre, precio y stock.
public class Producto {
  private String nombre;
  private double precio;
  private int stock;

  public Producto(String nombre, double precio, int stock){
    this.nombre=nombre;
    this.precio=precio;
    this.stock=stock;
  }

  public double getPrecio(){
    return precio;
  }


  //como mostrará información de un objeto es específico lo definimos como metodo de instancia
  public void mostraInformacion(){
    System.out.println("Producto:" + this.nombre + " Precio:$" + this.precio +" Cantidad:" + this.stock);
  }
  //Creá un método para calcular un descuento general para todos los productos de un 10%
  //Esto sera un método estático ya que es general y no solo de un objeto
  public static double calculoDescuento(double precio){
    return precio - ((precio * 10)/100);
  }

  public static void main(String[] args) {

    Producto producto1=new Producto("arroz",20.50,50);
    producto1.mostraInformacion();
    Producto producto2=new Producto("arveja",50.00,5);
    producto2.mostraInformacion();
    Producto producto3=new Producto("lenteja",10.00,10);
    producto3.mostraInformacion();
    Producto producto4=new Producto("atún",40.70,2);
    producto4.mostraInformacion();

    System.out.println("El nuevo precio del producto " + producto1.nombre + " al hacerle descuento del 10 % es de $" + calculoDescuento(producto1.precio)); //para el arroz
    System.out.println("El nuevo precio del producto " + producto2.nombre + " al hacerle descuento del 10 % es de $" + calculoDescuento(producto2.precio)); // para la arveja
    System.out.println("El nuevo precio del producto " + producto3.nombre + " al hacerle descuento del 10 % es de $" + calculoDescuento(producto3.precio)); // para la lenteja
    System.out.println("El nuevo precio del producto " + producto4.nombre + " al hacerle descuento del 10 % es de $" + calculoDescuento(producto4.precio)); // para el atún
  }
}
