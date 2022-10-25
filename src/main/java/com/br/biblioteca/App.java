package com.br.biblioteca;

import com.br.biblioteca.domain.Author;
import com.br.biblioteca.domain.Book;
import com.br.biblioteca.domain.Client;
import com.br.biblioteca.domain.Publisher;
import com.br.biblioteca.services.AuthorService;
import com.br.biblioteca.services.BookService;
import com.br.biblioteca.services.ClientService;
import com.br.biblioteca.services.PublisherService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var bookSvc = new BookService();

        var publisherSvc = new PublisherService();

        var publisher = new Publisher("teste", "teste.com");

        var autorServ = new AuthorService();

        var clientServ = new ClientService();

        autorServ.add(new Author("Teste"));

        clientServ.add(new Client("teste", "123"));

        publisherSvc.add(publisher);

        bookSvc.add(new Book("Title default", 1, publisher));

        System.out.println("Dado de livros...");
        System.out.println(bookSvc.getAll());
    }
}
