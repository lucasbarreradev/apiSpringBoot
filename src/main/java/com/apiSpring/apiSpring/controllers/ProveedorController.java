package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Proveedor;
import com.apiSpring.apiSpring.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/proveedor")
public class ProveedorController{

        @Autowired
        ProveedorService servicio;

        @GetMapping("/getAll")
        public ArrayList<Proveedor> getProveedor() {
            return servicio.getProveedor();
        }

        @GetMapping("/getId/{id}")
        public Optional<Proveedor> listarId(@PathVariable Long id) {
            return servicio.getIdProveedor(id);

        }

        @PostMapping("/save")
        public Proveedor saveProveedor(@RequestBody Proveedor proveedor) {
            return servicio.saveProveedor(proveedor);
        }

        @PutMapping("/update/{id}")
        public Proveedor updateProveedor(@RequestBody Proveedor proveedor, @PathVariable Long id) {
            return servicio.updateProveedor(proveedor, id);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteProveedor(@PathVariable Long id) {
            servicio.deleteProveedor(id);
        }
}
