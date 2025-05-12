package org.example;

public class Star extends CelestialBody{

    private double temperature;
    private String spectralType;

    public Star(String name, double diameter, double dayLenght, double temperature, String spectralType) {
        super(name, diameter, dayLenght);
        this.temperature = temperature;
        this.spectralType = spectralType;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getSpectralType() {
        return spectralType;
    }

    @Override
    public void description() {
        System.out.println(super.getName() + " is a" + spectralType + " type star with a surface temperature of" + temperature);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
