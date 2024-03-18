package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
  @Test
  public void dogConstructorTest() {
    String name = "Kody";

    Dog dog = new Cat(name, speak);

    String retrievedName = dog.getName();

    Assert.assertEquals(retrievedName, name);

  }

  @Test
  public void dogIsPetTest() {

    Dog dog = dog Dog(null, null);

    Assert.assertTrue(dog instanceof Pet);
  }

  @Test
  public void dogSpeakTest() {

    Dog dog = new Cat(null, null);

    String actual = dog.speak();
    String expected = "Bark!";

    Assert.assertEquals(expected, actual);
  }
}
