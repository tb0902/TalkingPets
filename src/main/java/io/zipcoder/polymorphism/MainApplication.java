package io.zipcoder.polymorphism;

import java.util.LinkedHashMap;
import java.util.Scanner;




public class MainApplication {

  public static void main(String[] args) {
    MainApplication main = new MainApplication();
    main.getPets();
  }

  LinkedHashMap<String, String> getPets() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many pets do you have?");
    int numberOfPets = scanner.nextInt();
    scanner.nextLine();
    LinkedHashMap<String, String> pets = new LinkedHashMap<>();

    for (int i = 0; i < numberOfPets; i++) {
      System.out.println("Enter your pet's species!");
      String petType = scanner.nextLine();


      System.out.println("Enter your pet's name!");
      String petName = scanner.nextLine();

      pets.put(petType, petName);

    }
    System.out.println(pets.toString());
    return pets;
  }



  }

