package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

    @Query("SELECT p.cantidad FROM Producto p WHERE p.id = :idProducto")
    int obtenerCantidadProducto(@Param("idProducto") Long idProducto);
    @Modifying
    @Query("UPDATE Producto p SET p.cantidad = :nuevaCantidad WHERE p.id = :idProducto")
    void actualizarCantidadProducto(@Param("idProducto") Long idProducto, @Param("nuevaCantidad") int nuevaCantidad);
}
