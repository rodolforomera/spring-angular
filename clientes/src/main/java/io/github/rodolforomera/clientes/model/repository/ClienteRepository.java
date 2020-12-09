package io.github.rodolforomera.clientes.model.repository;

import io.github.rodolforomera.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
