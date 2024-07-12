package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Venta;
import com.apiSpring.apiSpring.repositories.IventaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    IventaRepository repositorio;

    public ArrayList<Venta> getVenta() {
        return (ArrayList<Venta>) repositorio.findAll();
    }

    public Optional<Venta> getIdVenta(Long id) {
        return repositorio.findById(id);
    }

    public Venta saveVenta(Venta venta) {
        return repositorio.save(venta);
    }

    public Venta updateVenta(Venta venta, Long id){
        venta.setId(id);
        return repositorio.save(venta);
    }

    public void deleteVenta(Long id) {
        repositorio.deleteById(id);
    }
}