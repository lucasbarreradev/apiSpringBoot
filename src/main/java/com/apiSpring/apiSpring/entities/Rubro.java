package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "rubros")
@Data
public class Rubro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany (mappedBy="rubro")
    private Set<Producto> listaProductos;
    private String descripcion;
    private Boolean activo;
}
