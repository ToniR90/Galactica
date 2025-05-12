package org.example;

import java.util.Scanner;

public class Menu {

    public static int showMenu(){

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("Select an option:\n" +
                    "1. Show all Celestial Bodies\n" +
                    "2. Show planets with atmosphere\n" +
                    "3. Show moons by planet's name\n" +
                    "0. Exit\n");

            option = sc.nextInt();
        }while (option < 0 || option > 3);

        return option;
    }
}