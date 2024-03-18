package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {
  @Test
  public void snakeConstructorTest() {
    String name = "Onyx";

    Snake snake = new Snake(name, speak);

    String retrievedName = snake.getName();

    Assert.assertEquals(retrievedName, name);

  }

  @Test
  public void snakeIsPetTest() {

    Snake snake = new Snake();

    Assert.assertTrue(snake instanceof Pet);
  }

  @Test
  public void snakeSpeakTest() {

    Snake snake = new Snake();

    String actual = snake.speak();
    String expected = "SsSsssS!";

    Assert.assertEquals(expected, actual);
  }
}
