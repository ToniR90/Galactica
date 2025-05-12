package org.example;

import java.util.ArrayList;
import java.util.List;

public class SystemManager {

    private List<Planet> planetList = new ArrayList<>();
    private List<Star> starList = new ArrayList<>();

    public void addPlanet(Planet planet){
        if(planet != null){
            planetList.add(planet);
        }
    }

    public void addStar(Star star){
        if(star != null){
            starList.add(star);
        }
    }

    public List<Planet> getPlanetList(){
        return new ArrayList<>(planetList);
    }
}