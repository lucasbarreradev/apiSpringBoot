package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Ciudad;
import com.apiSpring.apiSpring.repositories.IciudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CiudadService {

    @Autowired
    IciudadRepository repositorio;

    public ArrayList<Ciudad> getCiudad() {
        return (ArrayList<Ciudad>) repositorio.findAll();
    }

    public Optional<Ciudad> getIdCiudad(Long id) {
        return repositorio.findById(id);
    }

    public Ciudad saveCiudad(Ciudad ciudad) {
        return repositorio.save(ciudad);
    }

    public Ciudad updateCiudad(Ciudad ciudad, Long id){
        ciudad.setId(id);
        return repositorio.save(ciudad);
    }

    public void deleteCiudad(Long id) {
        repositorio.deleteById(id);
    }
}
