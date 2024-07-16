package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Proveedor;
import com.apiSpring.apiSpring.repositories.IproveedorRepository;
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

class ProveedorServiceTest {

    @Mock
    IproveedorRepository proveedorRepository;
    @InjectMocks
    ProveedorService proveedorService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getProveedor() {
        List<Proveedor> listaEsperada = new ArrayList<>();
        listaEsperada.add(new Proveedor(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", null, null, null, "1234","cordoba","123","muchas veces", true));
        listaEsperada.add(new Proveedor(2L, "lucas", "montiel", "crate@gmail", "corrientes", "12345", null, null, null, "123456","cordoba","1234","muchas veces", true));
        Mockito.when(proveedorRepository.findAll()).thenReturn(listaEsperada);
        List<Proveedor> resultado = proveedorService.getProveedor();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdProveedor() {
        Optional<Proveedor> esperado = Optional.of(new Proveedor(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", null, null, null, "1234","cordoba","123","muchas veces", true));
        Mockito.when(proveedorRepository.findById(1L)).thenReturn(Optional.of(new Proveedor(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", null, null, null, "1234","cordoba","123","muchas veces", true)));
        Optional<Proveedor> resultado = proveedorService.getIdProveedor(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveProveedor() {
        Proveedor proveedorEsperado = (new Proveedor(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", null, null, null, "1234","cordoba","123","muchas veces", true));
        Mockito.when(proveedorRepository.save(proveedorEsperado)).thenReturn(new Proveedor(1L, "gonzalo", "rodriguez", "laeas@gmail", "chaco", "1234", null, null, null, "1234","cordoba","123","muchas veces", true));
        Proveedor resultado = proveedorService.saveProveedor(proveedorEsperado);
        Assertions.assertEquals(proveedorEsperado, resultado);
    }
}