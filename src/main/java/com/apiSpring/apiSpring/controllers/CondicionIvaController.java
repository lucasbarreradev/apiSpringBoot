package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.CondicionIva;
import com.apiSpring.apiSpring.services.CondicionIvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/condicion-iva")
public class CondicionIvaController {

    @Autowired
    CondicionIvaService servicio;

    @GetMapping("/getAll")
    public ArrayList<CondicionIva> getCondicionIva() {
        return servicio.getCondicionIva();
    }

    @GetMapping("/getId/{id}")
    public Optional<CondicionIva> listarId(@PathVariable Long id) {
        return servicio.getIdCondicionIva(id);
    }

    @PostMapping("/save")
    public CondicionIva saveCondicionIva(@RequestBody CondicionIva condicionIva) {
        return servicio.saveCondicionIva(condicionIva);
    }

    @PutMapping("/update/{id}")
    public CondicionIva updateCondicionIva(@RequestBody CondicionIva condicionIva, @PathVariable Long id) {
        return servicio.updateCondicionIva(condicionIva, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCondicionIva(@PathVariable Long id) {
        servicio.deleteCondicionIva(id);
    }
}
