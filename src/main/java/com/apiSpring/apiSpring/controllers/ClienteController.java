package com.apiSpring.apiSpring.controllers;

import com.apiSpring.apiSpring.entities.Cliente;
import com.apiSpring.apiSpring.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService servicio;

    @GetMapping("/getAll")
    public ArrayList<Cliente> getCliente() {
        return servicio.getCliente();
    }

    @GetMapping("/getId/{id}")
    public Optional<Cliente> listarId(@PathVariable Long id) {
        return servicio.getIdCliente(id);
    }

    @PostMapping("/save")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return servicio.saveCliente(cliente);
    }

    @PutMapping("/update/{id}")
    public Cliente updateCliente(@RequestBody Cliente cliente, @PathVariable Long id) {
        return servicio.updateCliente(cliente, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCliente(@PathVariable Long id) {
        servicio.deleteCliente(id);
    }
}
