package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.CondicionIva;
import com.apiSpring.apiSpring.repositories.IcondicionIvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CondicionIvaService {

    @Autowired
    IcondicionIvaRepository repositorio;

    public ArrayList<CondicionIva> getCondicionIva() {
        return (ArrayList<CondicionIva>) repositorio.findAll();
    }

    public Optional<CondicionIva> getIdCondicionIva(Long id) {
        return repositorio.findById(id);
    }

    public CondicionIva saveCondicionIva(CondicionIva condicionIva) {
        return repositorio.save(condicionIva);
    }

    public CondicionIva updateCondicionIva(CondicionIva condicionIva, Long id) {
        condicionIva.setId(id);
        return repositorio.save(condicionIva);
    }

    public void deleteCondicionIva(Long id) {
        repositorio.deleteById(id);
    }
}
