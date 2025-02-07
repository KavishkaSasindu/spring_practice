package org.example;

public class Alien {

    private Computer com;

    public Alien() {
        System.out.println("Alien object created");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        com.compute();
        System.out.println("Coding...");
    }
}
