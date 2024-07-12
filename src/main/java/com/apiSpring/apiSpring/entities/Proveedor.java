package com.apiSpring.apiSpring.entities;
import lombok.*;
import jakarta.persistence.*;
import java.util.Set;


@Entity
@Table(name = "proveedores")
@Data
public class Proveedor {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private String apellido;
        private String email;
        private String direccion;
        private String telefono;
        @ManyToOne
        @JoinColumn (name = "id_iva")
        private CondicionIva condicionIva;
        @ManyToOne
        @JoinColumn(name = "id_ciudad")
        private Ciudad ciudad;
        @OneToMany (mappedBy="proveedor")
        private Set<Producto> listaProductos;
        private String cuit;
        private String provincia;
        private String contacto;
        private String observaciones;
        private Boolean activo;
}
