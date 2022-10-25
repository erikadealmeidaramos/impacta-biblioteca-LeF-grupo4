package com.br.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;

import com.br.biblioteca.domain.Book;

public class BookRepository {
    private List<Book> books;

    public BookRepository(){
        super();
        books = new ArrayList<Book>();
        books.add(new Book("default", 0));
    }

    public List<Book> getAll(){
        return books;
    }

    public List<Book> add(Book book){
        books.add(book);
        return books;
    }
}
