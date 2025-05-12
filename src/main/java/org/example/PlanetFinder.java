package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlanetFinder {

    public static void findPlanets(List<Planet> planets) {
        for(Planet planet : planets){
            System.out.println(planet.getName());
        }
    }

    public static void findPlanetsWithAtmosphere(List<Planet> planets) {
        for (Planet planet : planets) {
            if (planet.getAtmosphere()) {
                System.out.println(planet.toString());
            }
        }
    }

    public static void findMoonByPlanet(List<Planet> planets , String name){
        for(Planet planet : planets){
            if(planet.getName().equalsIgnoreCase(name)){
                System.out.println(planet.getMoonList());
            }
        }
    }

}