package com.highlander.DesafioCrudDeClientes.services;

import com.highlander.DesafioCrudDeClientes.dto.ClientDTO;
import com.highlander.DesafioCrudDeClientes.entities.Client;
import com.highlander.DesafioCrudDeClientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
