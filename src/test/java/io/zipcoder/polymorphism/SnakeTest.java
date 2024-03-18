package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {
  @Test
  public void snakeConstructorTest() {
    String name = "Onyx";

    Snake snake = new Snake(name);

    String retrievedName = snake.getName();

    Assert.assertEquals(retrievedName, name);

  }

  @Test
  public void snakeIsPetTest() {
    String name = "Onyx";
    Snake snake = new Snake(name);

    Assert.assertTrue(snake instanceof Pet);
  }

  @Test
  public void snakeSpeakTest() {
    String name = "Onyx";
    Snake snake = new Snake(name);

    String actual = snake.speak();
    String expected = "SsSsssS!";

    Assert.assertEquals(expected, actual);
  }
}
