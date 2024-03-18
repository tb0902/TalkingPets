package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
  @Test
  public void dogConstructorTest() {
    String name = "Kody";

    Dog dog = new Dog(name);

    String retrievedName = dog.getName();

    Assert.assertEquals(retrievedName, name);

  }

  @Test
  public void dogIsPetTest() {
    String name = "Kody";
    Dog dog = new Dog(name);

    Assert.assertTrue(dog instanceof Pet);
  }

  @Test
  public void dogSpeakTest() {
    String name = "Kody";
    Dog dog = new Dog(name);

    String actual = dog.speak();
    String expected = "Bark!";

    Assert.assertEquals(expected, actual);
  }
}
