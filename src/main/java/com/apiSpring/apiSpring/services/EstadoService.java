package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Estado;
import com.apiSpring.apiSpring.repositories.IestadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    IestadoRepository repositorio;

    public ArrayList<Estado> getEstado() {
        return (ArrayList<Estado>) repositorio.findAll();
    }

    public Optional<Estado> getIdEstado(Long id) {
        return repositorio.findById(id);
    }

    public Estado saveEstado(Estado estado) {
        return repositorio.save(estado);
    }

    public Estado updateEstado(Estado estado, Long id){
        estado.setId(id);
        return repositorio.save(estado);
    }

    public void deleteEstado(Long id) {
        repositorio.deleteById(id);
    }
}
