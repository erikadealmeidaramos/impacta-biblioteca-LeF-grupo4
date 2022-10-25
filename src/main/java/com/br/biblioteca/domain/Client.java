package com.br.biblioteca.domain;

public class Client {
    private String name;
    private String rg;
    
    public Client(String name, String rg) {
        this.name = name;
        this.rg = rg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
}
