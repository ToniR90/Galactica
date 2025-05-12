package org.example;

import java.util.ArrayList;
import java.util.List;

public class Planet extends CelestialBody{

    private List<Moon> moonList;
    private boolean atmosphere;

    public Planet(String name, double diameter, double dayLenght, boolean atmosphere) {
        super(name, diameter, dayLenght);
        this.moonList = new ArrayList<>();
        this.atmosphere = atmosphere;
    }

    public int getMoonList() {
        return moonList.size();
    }

    public boolean getAtmosphere() {
        return atmosphere;
    }

    public void addMoon(Moon moon) {
        this.moonList.add(moon);
    }

    @Override
    public void description() {
        System.out.println(super.getName() + " has a diameter of " + super.getDiameter() + "km and" + atmosphere +
                        " an atmosphere. It has" + getMoonList() + " moon");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
