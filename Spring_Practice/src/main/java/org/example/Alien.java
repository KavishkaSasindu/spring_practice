package org.example;

public class Alien {

    private Laptop lap;

    private int codeLine;
    private String codingTime;

    public Alien() {
        System.out.println("Alien object Created");
    }

    public Alien(String codingTime) {
        System.out.println("Parameter Constructor is called");
        this.codingTime = codingTime;
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

    public String getCodingTime() {
        return codingTime;
    }

    public void setCodingTime(String codingTime) {
        this.codingTime = codingTime;
    }

    public void code() {
        lap.compile();
        System.out.println("Coding...." + codeLine);
        System.out.println("Coding Time: " + codingTime);
    }

}
