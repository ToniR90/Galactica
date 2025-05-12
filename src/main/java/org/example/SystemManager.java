package org.example;

import java.util.ArrayList;
import java.util.List;

public class SystemManager {

    private List<Planet> planetList = new ArrayList<>();

    public void addPlanet(Planet planet){
        if(planet != null){
            planetList.add(planet);
        }
    }

    public List<Planet> getPlanetList(){
        return new ArrayList<>(planetList);
    }
}