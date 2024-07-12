package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproveedorRepository extends JpaRepository<Proveedor, Long> {
}