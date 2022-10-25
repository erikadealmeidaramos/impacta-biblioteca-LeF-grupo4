package com.br.biblioteca.services;

import java.util.List;

import com.br.biblioteca.domain.Author;
import com.br.biblioteca.repository.AuthorRepository;

public class AuthorService {
    private AuthorRepository repo;

    public AuthorService(){
        super();
        repo = new AuthorRepository();
    }

    public List<Author> getAll(){
        return repo.getAll();
    }

    public List<Author> add(Author Author){
        repo.add(Author);
        return repo.getAll();
    }
}
