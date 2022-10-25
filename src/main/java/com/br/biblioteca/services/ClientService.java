package com.br.biblioteca.services;

import java.util.List;

import com.br.biblioteca.domain.Client;
import com.br.biblioteca.repository.ClientRepository;

public class ClientService {
    private ClientRepository repo;

    public ClientService(){
        super();
        repo = new ClientRepository();
    }

    public List<Client> getAll(){
        return repo.getAll();
    }

    public List<Client> add(Client Client){
        repo.add(Client);
        return repo.getAll();
    }
}
