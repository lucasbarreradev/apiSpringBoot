package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.CuentaCorriente;
import com.apiSpring.apiSpring.repositories.IcuentaCorrienteRepository;
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

class CuentaCorrienteServiceTest {

    @Mock
    IcuentaCorrienteRepository cuentaCorrienteRepository;
    @InjectMocks
    CuentaCorrienteService cuentaCorrienteService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getCuentaCorriente() {
        LocalDate fecha = LocalDate.of(2020, 10, 12);
        List<CuentaCorriente> listaEsperada = new ArrayList<>();
        listaEsperada.add(new CuentaCorriente(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha, 1200F));
        listaEsperada.add(new CuentaCorriente(2L, null, "marco", "marcelo", "venta", "cheque", 12000F, fecha, 12000F));
        Mockito.when(cuentaCorrienteRepository.findAll()).thenReturn(listaEsperada);
        List<CuentaCorriente> resultado = cuentaCorrienteService.getCuentaCorriente();
        Assertions.assertEquals(listaEsperada, resultado);
    }

    @Test
    void getIdCuentaCorriente() {
        LocalDate fecha = LocalDate.of(2020, 10, 12);
        Optional<CuentaCorriente> esperado = Optional.of(new CuentaCorriente(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha, 1200F));
        Mockito.when(cuentaCorrienteRepository.findById(1L)).thenReturn(Optional.of(new CuentaCorriente(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha, 1200F)));
        Optional<CuentaCorriente> resultado = cuentaCorrienteService.getIdCuentaCorriente(1L);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void saveCuentaCorriente() {
        LocalDate fecha = LocalDate.of(2020, 10, 12);
        CuentaCorriente cuentaCorrienteEsperada = (new CuentaCorriente(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha, 1200F));
        Mockito.when(cuentaCorrienteRepository.save(cuentaCorrienteEsperada)).thenReturn(new CuentaCorriente(1L, null, "rodriguez", "gonzalo", "venta", "cheque", 1200F, fecha, 1200F));
        CuentaCorriente resultado = cuentaCorrienteService.saveCuentaCorriente(cuentaCorrienteEsperada);
        Assertions.assertEquals(cuentaCorrienteEsperada, resultado);
    }
}