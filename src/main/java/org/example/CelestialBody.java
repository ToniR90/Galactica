package org.example;

public abstract class CelestialBody {

    private String name;
    private double diameter;
    private double dayLength;

    public CelestialBody(String name, double diameter, double dayLength) {
        this.name = name;
        this.diameter = diameter;
        this.dayLength = dayLength;
    }

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getDayLenght() {
        return dayLength;
    }

    public abstract void description();

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Diameter: " + diameter + "\n" +
                "DayLenght: " + dayLength + "\n";
    }
}
