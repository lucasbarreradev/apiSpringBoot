package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.CuentaCorriente;
import com.apiSpring.apiSpring.entities.Venta;
import com.apiSpring.apiSpring.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    VentaService servicio;

    @GetMapping("/getAll")
    public ArrayList<Venta> getVenta() {
        return servicio.getVenta();
    }

    @GetMapping("/getId/{id}")
    public Optional<Venta> listarId(@PathVariable Long id) {
        return servicio.getIdVenta(id);

    }

    @PostMapping("/save")
    public Venta saveVenta(@RequestBody Venta venta) {
        return servicio.saveVenta(venta);
    }

    @PutMapping("/update/{id}")
    public Venta updateVenta(@RequestBody Venta venta, @PathVariable Long id) {
        return servicio.updateVenta(venta, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVenta(@PathVariable Long id) {
        servicio.deleteVenta(id);
    }
}
