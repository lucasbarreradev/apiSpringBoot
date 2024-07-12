package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IventaRepository extends JpaRepository<Venta, Long> {
}
