  package com.techlab.inicio.POO_II;

  import com.techlab.inicio.POO_I.Producto;
  import java.util.ArrayList;

  public class Carrito {
    private ArrayList<Producto> productos;

    //Variables estáticas
    static int contProductos=0;

    //CONSTRUCTORES
    public Carrito(){
      this.productos= new ArrayList<>();
    }

    //MÉTODOS DE LA CLASE

    public void agregarProducto(Producto p){
      productos.add(p); // agregamos un producto a la lista
      contProductos=contProductos + 1;
    }

    public void sumarProductos(){ //contará la cantidad de instancias que hay en el programa
      System.out.println("La cantidad de productos que se crearon en el programa son: " + contProductos);
    }

    public double calcularTotal(){
      double total=0;
      for(int i=0; i < productos.size(); i ++){
        total= total + (productos.get(i).getPrecio() * productos.get(i).getStock());
      }
      return total;
    }

    public static void main(String[] args) {

      Carrito carrito= new Carrito(); //Inicializamos la lista vacía
      //Meteremos 4 productos al carrito
      carrito.agregarProducto(new Producto("Mayonesa", 20.00, 10));
      carrito.agregarProducto(new Producto("Manteca", 5.60, 80));
      carrito.agregarProducto(new Producto("Jamón en fetas 500g", 25.00, 5));
      carrito.agregarProducto(new Producto("Leche Larga Vida 1LT", 15.20, 180));
      carrito.productos.get(2).setStock(-10); //No cambió ya que el setter verifica que sea mayor a -1;
      System.out.println(carrito.productos.get(2).getStock());
      carrito.sumarProductos();
      //al ser un metodo de instancia JAVA ya se da cuenta de que productos hablamos osea del mismo carrito de donde lo llamamos
      System.out.println("El total a pagar del carrito es: $" + carrito.calcularTotal());
    }
  }
