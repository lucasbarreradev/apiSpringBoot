package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Venta;
import com.apiSpring.apiSpring.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/get-for-date/{fechaDesde}/{fechaHasta}")
    public ArrayList<Venta> getForDate(@PathVariable("fechaDesde") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaDesde,
                                       @PathVariable("fechaHasta") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaHasta) {
        return servicio.getForDate(fechaDesde, fechaHasta);
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
