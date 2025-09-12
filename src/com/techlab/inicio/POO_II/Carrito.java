package com.techlab.inicio.POO_II;
import com.techlab.inicio.POO_I.Producto;
import java.util.ArrayList;

public class Carrito {
  ArrayList<Producto> productos; //Este atributo es una lista de productos
  //Desclaramos un constructor para el objeto Carrito
  public Carrito(){ //incializo la lista vacía
    this.productos= new ArrayList<>();
  }
  public void agregarProducto(Producto producto){ //recibirá una instancia creada
    productos.add(producto); //agregamos el producto a la lista
  }

  public double calcularTotal(){
    double total=0;
    for(int i=0; i < productos.size(); i++){
      total=total + productos.get(i).getPrecio();
    }
    return total;
  }

  public static void main(String[] args) {
    Carrito carrito= new Carrito(); //instanciamos el objeto carrito
    //Crearemos instancias de productos
    Producto producto1= new Producto("arroz",20.50,4);
    //Necesitamos agregarlos al carrito
    carrito.agregarProducto(producto1);
    Producto producto2= new Producto("atún",35.70,10);
    //Necesitamos agregarlos al carrito
    carrito.agregarProducto(producto2);
    //Vamos sacando el total
    System.out.println("El total del carrito es $" + carrito.calcularTotal());
  }
}
