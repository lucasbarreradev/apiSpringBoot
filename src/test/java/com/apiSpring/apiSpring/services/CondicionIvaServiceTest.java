package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.CondicionIva;
import com.apiSpring.apiSpring.repositories.IcondicionIvaRepository;
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

class CondicionIvaServiceTest {

    @Mock
    IcondicionIvaRepository condicionIvaRepository;
    @InjectMocks
    CondicionIvaService condicionIvaService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getCondicionIva() {
        List<CondicionIva> listaEsperada = new ArrayList<>();
        listaEsperada.add(new CondicionIva(1L,null,"responsable inscripto",true));
        listaEsperada.add(new CondicionIva(2L,null,"consumidor final",true));
        Mockito.when(condicionIvaRepository.findAll()).thenReturn(listaEsperada);
        List<CondicionIva> resultado = condicionIvaService.getCondicionIva();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdCondicionIva() {
        Optional<CondicionIva> esperado = Optional.of(new CondicionIva(1L, null, "responsable inscripto", true));
        Mockito.when(condicionIvaRepository.findById(1L)).thenReturn(Optional.of(new CondicionIva(1L, null, "responsable inscripto", true)));
        Optional<CondicionIva> resultado = condicionIvaService.getIdCondicionIva(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveCondicionIva() {
        CondicionIva condicionIvaEsperada = new CondicionIva(1L, null, "responsable inscripto", true);
        Mockito.when(condicionIvaRepository.save(condicionIvaEsperada)).thenReturn(new CondicionIva(1L, null, "responsable inscripto", true));
        CondicionIva resultado = condicionIvaService.saveCondicionIva(condicionIvaEsperada);
        Assertions.assertEquals(condicionIvaEsperada, resultado);
    }

    @Test
    void updateCondicionIva() {
    }

    @Test
    void deleteCondicionIva() {
    }
}