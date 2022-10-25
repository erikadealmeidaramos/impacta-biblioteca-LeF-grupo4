package com.br.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import  com.br.biblioteca.domain.Publisher;

public class PublisherRepository {
    private List<Publisher> publishers;

    public PublisherRepository(){
        super();
        publishers = new ArrayList<Publisher>();
        publishers.add(new Publisher("default publisher", "www.publisherabc.com"));
    }

    public List<Publisher> getAll(){
        return publishers;
    }

    public List<Publisher> add(Publisher publisher){
        publishers.add(publisher);
        return publishers;
    }
    
}
