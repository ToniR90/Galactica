package org.example;

public class Main {
    public static void main(String[] args) {

        int option = 0;
        SystemManager systemManager = new SystemManager();

        System.out.println("Welcome to the Planet Project!!");


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