package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

@Test
  public void catConstructorTest() {
  String name = "Sphinx";

  Cat cat = new Cat(name);

  String retrievedName = cat.getName();

  Assert.assertEquals(retrievedName, name);

}

@Test
  public void catIsPetTest() {
  String name = "Sphinx";
  Cat cat = new Cat(name);

  Assert.assertTrue(cat instanceof Pet);
}

@Test
  public void catSpeakTest() {
  String name = "Sphinx";
  Cat cat = new Cat(name);

  String actual = cat.speak();
  String expected = "Meow!";

  Assert.assertEquals(expected, actual);
}
}
