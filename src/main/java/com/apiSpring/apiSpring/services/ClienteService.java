package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Cliente;
import com.apiSpring.apiSpring.repositories.IclienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    IclienteRepository repositorio;

    public ArrayList<Cliente> getCliente() {
        return (ArrayList<Cliente>) repositorio.findAll();
    }

    public Optional<Cliente> getIdCliente(Long id) {
        return repositorio.findById(id);
    }

    public Cliente saveCliente(Cliente cliente) {
        return repositorio.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente, Long id){
        cliente.setId(id);
        return repositorio.save(cliente);
    }

    public void deleteCliente(Long id) {
        repositorio.deleteById(id);
    }
}
