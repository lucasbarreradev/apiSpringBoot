package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Rubro;
import com.apiSpring.apiSpring.services.RubroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/rubro")
public class RubroController {

    @Autowired
    RubroService servicio;

    @GetMapping("/getAll")
    public ArrayList<Rubro> getRubro() {
        return servicio.getRubro();
    }

    @GetMapping("/getId/{id}")
    public Optional<Rubro> listarId(@PathVariable Long id) {
        return servicio.getIdRubro(id);

    }

    @PostMapping("/save")
    public Rubro saveRubro(@RequestBody Rubro rubro) {
        return servicio.saveRubro(rubro);
    }

    @PutMapping("/update/{id}")
    public Rubro updateRubro(@RequestBody Rubro rubro, @PathVariable Long id) {
        return servicio.updateRubro(rubro, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRubro(@PathVariable Long id) {
        servicio.deleteRubro(id);
    }
}
