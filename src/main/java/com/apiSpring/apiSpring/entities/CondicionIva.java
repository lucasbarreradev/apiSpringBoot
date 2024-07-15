package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "condiciones_iva")
@Data @AllArgsConstructor @NoArgsConstructor
public class CondicionIva {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToMany (mappedBy="condicionIva")
    private Set<Proveedor> listaProveedores;
    private String descripcion;
    private Boolean activo;
}
