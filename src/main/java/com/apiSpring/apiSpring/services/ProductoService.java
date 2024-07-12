package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Producto;
import com.apiSpring.apiSpring.repositories.IproductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    IproductoRepository repositorio;

    public ArrayList<Producto> getProducto() {
        return (ArrayList<Producto>) repositorio.findAll();
    }

    public Optional<Producto> getIdProducto(Long id) {
        return repositorio.findById(id);
    }

    public Producto saveProducto(Producto producto) {
        return repositorio.save(producto);
    }

    public Producto updateProducto(Producto producto, Long id){
        producto.setId(id);
        return repositorio.save(producto);
    }

    public void deleteProducto(Long id) {
        repositorio.deleteById(id);
    }
}
