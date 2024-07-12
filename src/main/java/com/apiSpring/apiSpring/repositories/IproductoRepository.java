package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproductoRepository extends JpaRepository<Producto, Long> {
}
