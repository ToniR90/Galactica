package org.example;

import java.util.Scanner;

public class Factory {

    static Scanner sc = new Scanner(System.in);

    public static Planet createPlanet(){
        System.out.println("Insert the planet's name");
        String name = sc.nextLine().trim();
        System.out.println("Insert the diameter");
        double diameter = sc.nextDouble();
        System.out.println("Insert the lenght of the day");
        double dayLength = sc.nextDouble();
        System.out.println("Has an atmosphere? (yes/no)");
        String hasAtmosphere = sc.nextLine();
        boolean atmosphere = false;
        if(hasAtmosphere.equalsIgnoreCase("yes")) {
            atmosphere = true;
        }

        Planet newPlanet = new Planet(name , diameter , dayLength , atmosphere);

        System.out.println("Does the planet have any moon? (yes/no)");
        String answer = sc.nextLine().trim();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("How many moons does it have?");
            int moonQuantity = sc.nextInt();
            sc.nextLine();

            for(int i = 0 ; i < moonQuantity ; i++){
                System.out.println("Let's register the moon nº" + (i + 1));
                Moon newMoon = createMoon();
                newPlanet.addMoon(newMoon);
                System.out.println("The satellite nº" + (i + 1) + " has been added");
            }
        }

        System.out.println("The planet has been created");
        return newPlanet;
    }

    public static Moon createMoon(){
        System.out.println("Insert the name");
        String name = sc.nextLine();
        System.out.println("Insert the diameter");
        double diameter = sc.nextDouble();
        System.out.println("Insert the day length");
        double dayLength = sc.nextDouble();
        System.out.println("Has a rocky suerface? (yes/no)");
        boolean surface = false;
        String isRocky = sc.nextLine();
        if(isRocky.equalsIgnoreCase("yes")) {
            surface = true;
        }


        return new Moon(name , diameter , dayLength , surface);
    }

    public static Star createStar(){
        System.out.println("Insert the name");
        String name = sc.nextLine();
        System.out.println("Insert the diameter");
        double diameter = sc.nextDouble();
        System.out.println("Insert the day length");
        double dayLength = sc.nextDouble();
        System.out.println("Insert the temperature");
        double temperature = sc.nextDouble();
        System.out.println("Insert the spectral type");
        String spectralType = sc.nextLine();

        return new Star(name , diameter , dayLength , temperature , spectralType);
    }
}

