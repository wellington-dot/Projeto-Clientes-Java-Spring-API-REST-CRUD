package com.desafiocrud.clientes.repositories;

import com.desafiocrud.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRespository extends JpaRepository<Client, Long> {

}
