package org.example;

public class Laptop implements Computer{
    @Override
    public void compute() {
        System.out.println("Computing laptop");
    }
}
