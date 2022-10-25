package com.br.biblioteca.services;

import java.util.List;

import com.br.biblioteca.domain.Book;
import com.br.biblioteca.repository.BookRepository;

public class BookService {
    private BookRepository repo;

    public BookService(){
        super();
        repo = new BookRepository();
    }

    public List<Book> getAll(){
        return repo.getAll();
    }

    public List<Book> add(Book book){
        repo.add(book);
        return repo.getAll();
    }
}
