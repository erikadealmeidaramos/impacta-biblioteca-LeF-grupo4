package com.br.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.br.biblioteca.domain.Author;

public class AuthorRepository {
    private List<Author> authors;

    public AuthorRepository() {
        super();
        authors = new ArrayList<Author>();
        authors.add(new Author("Author Default"));
    }

    public List<Author> getAll(){
        return authors;
    }

    public List<Author> add(Author author){
        authors.add(author);
        return authors;
    }
    
}
