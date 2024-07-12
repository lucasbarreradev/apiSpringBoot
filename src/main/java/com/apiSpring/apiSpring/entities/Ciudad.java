package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "ciudades")
@Data
public class Ciudad {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToMany (mappedBy="ciudad")
    Set<Proveedor> listaProveedores;
    private String nombre;
    private Boolean activo;
}
