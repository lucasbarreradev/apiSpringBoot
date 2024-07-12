package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "ventas")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private Cliente cliente;
    private String apellido;
    private String nombre;
    private String tipoVenta;
    private String tipoComprobante;
    private Float totalVenta;
    private String fechaVenta;
}
