package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrubroRepository extends JpaRepository<Rubro, Long> {
}
