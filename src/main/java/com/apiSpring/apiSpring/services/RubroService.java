package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Rubro;
import com.apiSpring.apiSpring.repositories.IrubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RubroService {

    @Autowired
    IrubroRepository repositorio;

    public ArrayList<Rubro> getRubro() {
        return (ArrayList<Rubro>) repositorio.findAll();
    }

    public Optional<Rubro> getIdRubro(Long id) {
        return repositorio.findById(id);
    }

    public Rubro saveRubro(Rubro rubro) {
        return repositorio.save(rubro);
    }

    public Rubro updateRubro(Rubro rubro, Long id){
        rubro.setId(id);
        return repositorio.save(rubro);
    }

    public void deleteRubro(Long id) {
        repositorio.deleteById(id);
    }
}
