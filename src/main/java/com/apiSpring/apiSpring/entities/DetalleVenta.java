package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalles_ventas")
@Data
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "id_producto")
    private Producto producto;
    private int nroComprobante;
    private String descripcion;
    private int cantidad;
    private Float precioUnitario;
    private Float precioTotal;
}
