package org.example;

public class CostCalculator {
    private double kgCost;
    private int kmCost;

    public CostCalculator(double kgCost, int kmCost) {
        this.kgCost = kgCost;
        this.kmCost = kmCost;
    }

    public  double deliverCost(Box box, int km) {
        return box.getWeight() * kgCost + km * kmCost;
    }
    public  double deliverCost(double kg, int km) {
        return kg * kgCost + km * kmCost;
    }
}
