package org.example;

public class Alien {

    private Laptop lap;

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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code() {
        lap.compile();
        System.out.println("Coding...."+codeLine);
    }

}
