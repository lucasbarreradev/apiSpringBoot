package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "productos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "id_proveedor")
    private Proveedor proveedor;
    @ManyToOne
    @JoinColumn (name = "id_rubro")
    private Rubro rubro;
    @ManyToOne
    @JoinColumn (name = "id_estado")
    private Estado estado;
    private String descripcion;
    private int codigo;
    private Float costo;
    private Date fechaCarga;
    private Date fechaActualizacion;
    private String observaciones;
    private Boolean activo;
    private int cantidad;
    private Float precioVenta;
}
