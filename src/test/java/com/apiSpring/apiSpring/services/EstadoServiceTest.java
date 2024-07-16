package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Estado;
import com.apiSpring.apiSpring.repositories.IestadoRepository;
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


class EstadoServiceTest {

    @Mock
    IestadoRepository estadoRepository;
    @InjectMocks
    EstadoService estadoService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getEstado() {
        List<Estado> listaEsperada = new ArrayList<>();
        listaEsperada.add(new Estado(1L,null,"Usado",true));
        listaEsperada.add(new Estado(2L,null,"Nuevo",true));
        Mockito.when(estadoRepository.findAll()).thenReturn(listaEsperada);
        List<Estado> resultado = estadoService.getEstado();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdEstado() {
        Optional<Estado> esperado = Optional.of(new Estado(1L, null, "Usado", true));
        Mockito.when(estadoRepository.findById(1L)).thenReturn(Optional.of(new Estado(1L, null, "Usado", true)));
        Optional<Estado> resultado = estadoService.getIdEstado(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveEstado() {
        Estado estadoEsperado = new Estado(1L, null, "Usado", true);
        Mockito.when(estadoRepository.save(estadoEsperado)).thenReturn(new Estado(1L, null, "Usado", true));
        Estado resultado = estadoService.saveEstado(estadoEsperado);
        Assertions.assertEquals(estadoEsperado, resultado);
    }
}