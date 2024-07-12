package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.CuentaCorriente;
import com.apiSpring.apiSpring.repositories.IcuentaCorrienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CuentaCorrienteService {

    @Autowired
    IcuentaCorrienteRepository repositorio;

    public ArrayList<CuentaCorriente> getCuentaCorriente() {
        return (ArrayList<CuentaCorriente>) repositorio.findAll();
    }

    public Optional<CuentaCorriente> getIdCuentaCorriente(Long id) {
        return repositorio.findById(id);
    }

    public CuentaCorriente saveCuentaCorriente(CuentaCorriente cuentaCorriente) {
        return repositorio.save(cuentaCorriente);
    }

    public CuentaCorriente updateCuentaCorriente(CuentaCorriente cuentaCorriente, Long id){
        cuentaCorriente.setId(id);
        return repositorio.save(cuentaCorriente);
    }

    public void deleteCuentaCorriente(Long id) {
        repositorio.deleteById(id);
    }
}
