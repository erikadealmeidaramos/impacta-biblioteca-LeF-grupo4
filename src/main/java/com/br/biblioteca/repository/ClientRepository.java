package com.br.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.br.biblioteca.domain.Client;

public class ClientRepository {
    private List<Client> clients;

    public ClientRepository(){
        super();
        clients = new ArrayList<Client>();
        clients.add(new Client("client default", "1111"));
    }

    public List<Client> getAll(){
        return clients;
    }

    public List<Client> add(Client client){
        clients.add(client);
        return clients;
    }
}
