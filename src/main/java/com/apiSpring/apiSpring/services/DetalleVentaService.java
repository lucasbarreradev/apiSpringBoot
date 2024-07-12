package com.apiSpring.apiSpring.services;

import com.apiSpring.apiSpring.entities.DetalleVenta;
import com.apiSpring.apiSpring.repositories.IdetalleVentaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DetalleVentaService {

    @Autowired
    IdetalleVentaRepository repositorio;

    @Transactional
    public DetalleVenta saveDetalleVenta(DetalleVenta detalleVenta) {

        Long idProducto = detalleVenta.getProducto().getId();
        int cantidadVendida = detalleVenta.getCantidad();

        int cantidadActual = repositorio.obtenerCantidadProducto(idProducto);

        if (cantidadActual < cantidadVendida) {
            throw new RuntimeException("No hay suficiente cantidad del producto para vender.");
        }

        int nuevaCantidad = cantidadActual - cantidadVendida;

        repositorio.actualizarCantidadProducto(idProducto, nuevaCantidad);

        return repositorio.save(detalleVenta);
        }
    }




