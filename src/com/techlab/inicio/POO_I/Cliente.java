package com.techlab.inicio.POO_I;
//Creá una clase Cliente con atributos nombre y email.
public class Cliente {
  //ATRIBUTOS
  private String nombre;
  private String email;
  //Creá un constructor para Cliente que reciba el nombre y email
  public Cliente(String nombre, String email){
    this.nombre=nombre;
    this.email=email;
  }

  public String getEmail(){
    return email;
  }
  public void setCorreo(String email){
    if(email.contains("@") && !email.trim().isEmpty()){
      this.email=email;
    }
  }
  public String nombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    if(!nombre.trim().isEmpty()){
      this.nombre=nombre;
    }
  }

  public static void main(String[] args) {
    //Instanciá un objeto Cliente y asígnale valores a sus atributos.
    Cliente cliente1= new Cliente("Alex More", "alexmore@hotmail.com");
    //Creá varios clientes con este constructor y mostralos por pantalla
    Cliente cliente2= new Cliente("Juan Moreno López", "juanlopez@hotmail.com");
    Cliente cliente3= new Cliente("María Torre", "mari_to24@hotmail.com");
    Cliente cliente4= new Cliente("Alejandro Pérez", "aleLop@hotmail.com");
    Cliente cliente5= new Cliente("Martin Cirio", "martin_cirio@hotmail.com");
    System.out.println(cliente1.nombre + " " + cliente1.email);
    System.out.println(cliente2.nombre + " " + cliente2.email);
    System.out.println(cliente3.nombre + " " + cliente3.email);
    System.out.println(cliente4.nombre + " " + cliente4.email);
    System.out.println(cliente5.nombre + " " + cliente5.email);
  }
}
