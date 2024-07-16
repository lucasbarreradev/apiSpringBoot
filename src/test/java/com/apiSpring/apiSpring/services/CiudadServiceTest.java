package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Ciudad;
import com.apiSpring.apiSpring.repositories.IciudadRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.*;



class CiudadServiceTest {

    @Mock
    IciudadRepository ciudadRepository;
    @InjectMocks
    CiudadService ciudadService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getIdCiudad() {
        Optional<Ciudad> esperado = Optional.of(new Ciudad(1L, null, "Bell Ville", true));
        Mockito.when(ciudadRepository.findById(1L)).thenReturn(Optional.of(new Ciudad(1L, null, "Bell Ville", true)));
        Optional<Ciudad> resultado = ciudadService.getIdCiudad(1L);
        Assertions.assertEquals(esperado, resultado);
    }
    @Test
    void getCiudad() {
        List<Ciudad>listaEsperada = new ArrayList<>();
        listaEsperada.add(new Ciudad(1L,null,"Bell Ville",true));
        listaEsperada.add(new Ciudad(2L,null,"Morrison",true));
        Mockito.when(ciudadRepository.findAll()).thenReturn(listaEsperada);
        List<Ciudad> resultado = ciudadService.getCiudad();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void saveCiudad() {
        Ciudad ciudadEsperada = new Ciudad(1L, null, "Bell Ville", true);
        Mockito.when(ciudadRepository.save(ciudadEsperada)).thenReturn(new Ciudad(1L, null, "Bell Ville", true));
        Ciudad resultado = ciudadService.saveCiudad(ciudadEsperada);
        Assertions.assertEquals(ciudadEsperada, resultado);
    }

    @Test
    void updateCiudad() {
    }

    @Test
    void deleteCiudad() {

    }
}