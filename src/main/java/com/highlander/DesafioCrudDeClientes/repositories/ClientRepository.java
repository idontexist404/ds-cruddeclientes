package com.highlander.DesafioCrudDeClientes.repositories;

import com.highlander.DesafioCrudDeClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
