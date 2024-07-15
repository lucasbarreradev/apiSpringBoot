package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "estados")
@Data @AllArgsConstructor @NoArgsConstructor
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "estado")
    private Set<Producto> listaProductos;
    private String descripcion;
    private Boolean activo;
}
