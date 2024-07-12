package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Proveedor;
import com.apiSpring.apiSpring.repositories.IproveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    IproveedorRepository repositorio;

    public ArrayList<Proveedor> getProveedor() {
        return (ArrayList<Proveedor>) repositorio.findAll();
    }

    public Optional<Proveedor> getIdProveedor(Long id) {
        return repositorio.findById(id);
    }

    public Proveedor saveProveedor(Proveedor proveedor) {
        return repositorio.save(proveedor);
    }

    public Proveedor updateProveedor(Proveedor proveedor, Long id){
        proveedor.setId(id);
        return repositorio.save(proveedor);
    }

    public void deleteProveedor(Long id) {
        repositorio.deleteById(id);
    }
}
