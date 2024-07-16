package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Cliente;
import com.apiSpring.apiSpring.repositories.IclienteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ClienteServiceTest {

    @Mock
    IclienteRepository clienteRepository;
    @InjectMocks
    ClienteService clienteService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getCliente() {
        List<Cliente> listaEsperada = new ArrayList<>();
        listaEsperada.add(new Cliente(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", true, true, null, null));
        listaEsperada.add(new Cliente(2L,"lisandro", "martinez", "aeds@gmail", "corrientes", "1234", true, true, null, null));
        Mockito.when(clienteRepository.findAll()).thenReturn(listaEsperada);
        List<Cliente> resultado = clienteService.getCliente();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdCliente() {
        Optional<Cliente> esperado = Optional.of(new Cliente(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", true, true, null, null));
        Mockito.when(clienteRepository.findById(1L)).thenReturn(Optional.of(new Cliente(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", true, true, null, null)));
        Optional<Cliente> resultado = clienteService.getIdCliente(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveCliente() {
        Cliente clienteEsperado = new Cliente(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", true, true, null, null);
        Mockito.when(clienteRepository.save(clienteEsperado)).thenReturn(new Cliente(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", true, true, null, null));
        Cliente resultado = clienteService.saveCliente(clienteEsperado);
        Assertions.assertEquals(clienteEsperado, resultado);
    }

    @Test
    void updateCliente() {
    }

    @Test
    void deleteCliente() {
    }
}