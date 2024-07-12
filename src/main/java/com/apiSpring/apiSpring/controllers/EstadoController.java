package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Estado;
import com.apiSpring.apiSpring.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    EstadoService servicio;

    @GetMapping("/getAll")
    public ArrayList<Estado> getEstado() {
        return servicio.getEstado();
    }

    @GetMapping("/getId/{id}")
    public Optional<Estado> listarId(@PathVariable Long id) {
        return servicio.getIdEstado(id);

    }

    @PostMapping("/save")
    public Estado saveEstado(@RequestBody Estado estado) {
        return servicio.saveEstado(estado);
    }

    @PutMapping("/update/{id}")
    public Estado updateEstado(@RequestBody Estado estado, @PathVariable Long id) {
        return servicio.updateEstado(estado, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEstado(@PathVariable Long id) {
        servicio.deleteEstado(id);
    }
}
