package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.Venta;
import com.apiSpring.apiSpring.repositories.IventaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class VentaServiceTest {

    @Mock
    IventaRepository ventaRepository;
    @InjectMocks
    VentaService ventaService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getVenta() {
        LocalDate fecha = LocalDate.of(2020, 10, 12);
        List<Venta> listaEsperada = new ArrayList<>();
        listaEsperada.add(new Venta(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha));
        listaEsperada.add(new Venta(2L, null, "marco", "marcelo", "venta", "cheque", 12000F, fecha));
        Mockito.when(ventaRepository.findAll()).thenReturn(listaEsperada);
        List<Venta> resultado = ventaService.getVenta();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdVenta() {
        LocalDate fecha = LocalDate.of(2020, 10, 12);
        Optional<Venta> esperado = Optional.of(new Venta(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha));;
        Mockito.when(ventaRepository.findById(1L)).thenReturn(Optional.of(new Venta(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha)));
        Optional<Venta> resultado = ventaService.getIdVenta(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveVenta() {
        LocalDate fecha = LocalDate.of(2020, 10, 12);
        Venta ventaEsperada = (new Venta(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha));
        Mockito.when(ventaRepository.save(ventaEsperada)).thenReturn(new Venta(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha));
        Venta resultado = ventaService.saveVenta(ventaEsperada);
        Assertions.assertEquals(ventaEsperada, resultado);
    }
}