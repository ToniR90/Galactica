package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option = 0;
        SystemManager systemManager = new SystemManager();

        System.out.println("Welcome to the Planet Project!!");

        Scanner sc = new Scanner(System.in);

        systemManager.addPlanet(Factory.createPlanet());
        systemManager.addStar(Factory.createStar());

        do{
            option = Menu.showMenu();

            switch(option){
                case 1:
                    System.out.println(systemManager.getPlanetList());
                    break;

                case 2:
                    PlanetFinder.findPlanetsWithAtmosphere(systemManager.getPlanetList());
                    break;

                case 3:
                    System.out.println("Insert the planet's name");
                    String name = sc.nextLine();
                    PlanetFinder.findMoonByPlanet(systemManager.getPlanetList() , name);
                    break;

                case 0:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Select an option between 0 - 3");
            }
        }while(option != 0);

    }
}