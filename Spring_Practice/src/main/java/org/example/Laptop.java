package org.example;

public class Laptop {

    private int compileTime;

    public Laptop() {
        System.out.println("Laptop object is created");
    }

    public void compile() {
        System.out.println("Compiling...." + compileTime);
    }

    public int getCompileTime() {
        return compileTime;
    }

    public void setCompileTime(int compileTime) {
        this.compileTime = compileTime;
    }
}
