package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Rubro;
import com.apiSpring.apiSpring.repositories.IrubroRepository;
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

class RubroServiceTest {
    @Mock
    IrubroRepository rubroRepository;
    @InjectMocks
    RubroService rubroService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getRubro() {
        List<Rubro> listaEsperada = new ArrayList<>();
        listaEsperada.add(new Rubro(1L,null,"Gastronomia",true));
        listaEsperada.add(new Rubro(2L,null,"Bebidas",true));
        Mockito.when(rubroRepository.findAll()).thenReturn(listaEsperada);
        List<Rubro> resultado = rubroService.getRubro();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdRubro() {
        Optional<Rubro> esperado = Optional.of(new Rubro(1L, null, "Gastronomía", true));
        Mockito.when(rubroRepository.findById(1L)).thenReturn(Optional.of(new Rubro(1L, null, "Gastronomía", true)));
        Optional<Rubro> resultado = rubroService.getIdRubro(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveRubro() {
        Rubro rubroEsperado = new Rubro(1L, null, "Electrónica", true);
        Mockito.when(rubroRepository.save(rubroEsperado)).thenReturn(new Rubro(1L, null, "Electrónica", true));
        Rubro resultado = rubroService.saveRubro(rubroEsperado);
        Assertions.assertEquals(rubroEsperado, resultado);
    }
}