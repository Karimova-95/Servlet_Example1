package org.example;

public class Table implements Box{
    private int legsCount;
    private double weight;

    public Table(int legsCount, double weight) {
        this.legsCount = legsCount;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
