package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Producto;
import com.apiSpring.apiSpring.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService servicio;

    @GetMapping("/getAll")
    public ArrayList<Producto> getProducto() {
        return servicio.getProducto();
    }

    @GetMapping("/getId/{id}")
    public Optional<Producto> listarId(@PathVariable Long id) {
        return servicio.getIdProducto(id);

    }

    @PostMapping("/save")
    public Producto saveProducto(@RequestBody Producto producto) {
        return servicio.saveProducto(producto);
    }

    @PutMapping("/update/{id}")
    public Producto updateProducto(@RequestBody Producto producto, @PathVariable Long id) {
        return servicio.updateProducto(producto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProducto(@PathVariable Long id) {
        servicio.deleteProducto(id);
    }
}
