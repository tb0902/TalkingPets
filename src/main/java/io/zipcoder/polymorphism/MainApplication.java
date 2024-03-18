package io.zipcoder.polymorphism;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {

  public static void main(String[] args) {
    MainApplication main = new MainApplication();
    printPetNameSpeak();
  }

  static LinkedHashMap<Pet, String> getPets() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many pets do you have?");
    int numberOfPets = scanner.nextInt();
    scanner.nextLine();

    LinkedHashMap<Pet, String> pets = new LinkedHashMap<>();

    for (int i = 0; i < numberOfPets; i++) {
      System.out.println("Enter your pet's species!");
      String petType = scanner.nextLine();

      System.out.println("Enter your pet's name!");
      String petName = scanner.nextLine();

      if (petType.equals("Dog")) {
        Dog dog = new Dog(petName);
        pets.put(dog, petName);
      }
      else if (petType.equals("Cat")) {
        Cat cat = new Cat(petName);
        pets.put(cat, petName);
      }
      else {
        Snake snake = new Snake(petName);
        pets.put(snake, petName);
      }

    }
    return pets;
  }

  public static void printPetNameSpeak() {
    LinkedHashMap<Pet, String> inputPets = getPets();

    for (Map.Entry<Pet, String> pet : inputPets.entrySet()) {
      System.out.println(pet.getValue() + " " + pet.getKey().speak());
    }
  }

}

