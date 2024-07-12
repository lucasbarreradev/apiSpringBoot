package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.CuentaCorriente;
import com.apiSpring.apiSpring.services.CuentaCorrienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cuenta-corriente")
public class CuentaCorrienteController {

    @Autowired
    CuentaCorrienteService servicio;

    @GetMapping("/getAll")
    public ArrayList<CuentaCorriente> getCuentaCorriente() {
        return servicio.getCuentaCorriente();
    }

    @GetMapping("/getId/{id}")
    public Optional<CuentaCorriente> listarId(@PathVariable Long id) {
        return servicio.getIdCuentaCorriente(id);

    }

    @PostMapping("/save")
    public CuentaCorriente saveCuentaCorriente(@RequestBody CuentaCorriente cuentaCorriente) {
        return servicio.saveCuentaCorriente(cuentaCorriente);
    }

    @PutMapping("/update/{id}")
    public CuentaCorriente updateCuentaCorriente(@RequestBody CuentaCorriente cuentaCorriente, @PathVariable Long id) {
        return servicio.updateCuentaCorriente(cuentaCorriente, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCuentaCorriente(@PathVariable Long id) {
        servicio.deleteCuentaCorriente(id);
    }
}
