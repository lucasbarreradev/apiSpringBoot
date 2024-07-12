package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "estados")
@Data
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "estado")
    private Set<Producto> listaProductos;
    private String descripcion;
    private Boolean activo;
}
