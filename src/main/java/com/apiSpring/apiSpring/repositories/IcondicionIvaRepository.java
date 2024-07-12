package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.CondicionIva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcondicionIvaRepository extends JpaRepository<CondicionIva, Long> {
}
