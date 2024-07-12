package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.CuentaCorriente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcuentaCorrienteRepository extends JpaRepository<CuentaCorriente, Long> {
}
