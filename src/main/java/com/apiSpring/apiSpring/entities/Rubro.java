package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "rubros")
@Data @AllArgsConstructor @NoArgsConstructor
public class Rubro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany (mappedBy="rubro")
    private Set<Producto> listaProductos;
    private String descripcion;
    private Boolean activo;
}
