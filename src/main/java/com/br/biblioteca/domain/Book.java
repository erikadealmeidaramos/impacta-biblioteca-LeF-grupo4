package com.br.biblioteca.domain;

public class Book {
    private String title;
    private int edition;
    private Publisher publisher;

    public Book(String title, int edition) {
        this.title = title;
        this.edition = edition;
    }
    public Book(String title, int edition, Publisher publisher) {
        this.title = title;
        this.edition = edition;
        this.publisher = publisher;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
}
