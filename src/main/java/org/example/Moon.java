package org.example;

public class Moon extends CelestialBody{

    private boolean surface;

    public Moon(String name, double diameter, double dayLenght, boolean surface) {
        super(name, diameter, dayLenght);
        this.surface = surface;
    }

    public boolean getSurface() {
        return surface;
    }

    @Override
    public void description() {
        System.out.println(super.getName() + " orbits the Earth. Its surface" + surface + " rocky and its diameter is"
                + super.getDiameter() +" km");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
