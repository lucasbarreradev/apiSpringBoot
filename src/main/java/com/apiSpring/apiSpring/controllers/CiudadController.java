package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Ciudad;
import com.apiSpring.apiSpring.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    CiudadService servicio;

    @GetMapping("/getAll")
    public ArrayList<Ciudad> getCiudad() {
        return servicio.getCiudad();
    }

    @GetMapping("/getId/{id}")
    public Optional<Ciudad> listarId(@PathVariable Long id) {
        return servicio.getIdCiudad(id);

    }

    @PostMapping("/save")
    public Ciudad saveCiudad(@RequestBody Ciudad ciudad) {
        return servicio.saveCiudad(ciudad);
    }

    @PutMapping("/update/{id}")
    public Ciudad updateCiudad(@RequestBody Ciudad ciudad, @PathVariable Long id) {
        return servicio.updateCiudad(ciudad, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCiudad(@PathVariable Long id) {
        servicio.deleteCiudad(id);
    }
}
