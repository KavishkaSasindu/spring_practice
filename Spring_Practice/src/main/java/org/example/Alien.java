package org.example;

public class Alien {

    private int codeLine;

    public Alien() {
        System.out.println("Alien object Created");
    }

    public int getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(int codeLine) {
        this.codeLine = codeLine;
    }

    public void code() {
        System.out.println("Coding...."+codeLine);
    }

}
