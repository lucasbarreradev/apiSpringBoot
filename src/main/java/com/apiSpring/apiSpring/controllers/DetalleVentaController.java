package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.DetalleVenta;
import com.apiSpring.apiSpring.services.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalle-venta")
public class DetalleVentaController {

    @Autowired
    DetalleVentaService servicio;

    @PostMapping("/save")
    public DetalleVenta saveDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return servicio.saveDetalleVenta(detalleVenta);
    }

}
