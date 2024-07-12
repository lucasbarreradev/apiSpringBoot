package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IestadoRepository extends JpaRepository<Estado, Long> {
}
