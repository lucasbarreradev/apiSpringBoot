package com.apiSpring.apiSpring.repositories;

import com.apiSpring.apiSpring.entities.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IciudadRepository extends JpaRepository<Ciudad, Long> {
}
