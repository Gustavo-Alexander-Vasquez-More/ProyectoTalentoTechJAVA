package com.techLab.learningModules.services;
import com.techLab.learningModules.exceptions.ProductoNoEncontradoException;

public class BuscarProductoService {

  public String nameProduct;

  public BuscarProductoService(String nameProduct) {
    this.nameProduct=nameProduct;
  }

  public void buscarProductoPorNombre(String nombre) throws ProductoNoEncontradoException {
    if(!nombre.equals(nameProduct)){
      throw new ProductoNoEncontradoException("El nombre buscado no coincide con ningún producto");
    }
  }

}
