package com.br.biblioteca.services;

import java.util.List;

import com.br.biblioteca.domain.Publisher;
import com.br.biblioteca.repository.PublisherRepository;

public class PublisherService {
    private PublisherRepository repo;

    public PublisherService(){
        super();
        repo = new PublisherRepository();
    }

    public List<Publisher> getAll(){
        return repo.getAll();
    }

    public List<Publisher> add(Publisher Publisher){
        repo.add(Publisher);
        return repo.getAll();
    }
}
