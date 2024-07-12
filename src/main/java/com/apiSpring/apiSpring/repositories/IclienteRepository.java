package com.apiSpring.apiSpring.repositories;
import com.apiSpring.apiSpring.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IclienteRepository extends JpaRepository<Cliente, Long> {
}
