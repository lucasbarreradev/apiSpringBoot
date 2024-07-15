package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface IventaRepository extends JpaRepository<Venta, Long> {

    @Query(value = "SELECT * FROM ventas v WHERE v.fecha_venta>= :fechaDesde AND v.fecha_venta<= :fechaHasta", nativeQuery = true)
    ArrayList<Venta> getForDate(@Param("fechaDesde") Date fechaDesde, @Param("fechaHasta") Date fechaHasta);
}
