package com.apiSpring.apiSpring.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "cuentas_corrientes")
@Data @AllArgsConstructor @NoArgsConstructor
public class CuentaCorriente {
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
    private LocalDate fechaVenta;
    private Float saldo;

}
