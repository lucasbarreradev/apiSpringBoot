package com.apiSpring.apiSpring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table (name = "clientes")
@Data @AllArgsConstructor @NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private Boolean tipoCliente;
    private Boolean activo;
    @OneToMany (mappedBy="cliente")
    private Set<CuentaCorriente> listaCuentasCorrientes;
    @OneToMany (mappedBy="cliente")
    private Set<Venta> listaVentas;

}
