package dk.cngroup.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingTest {

  private Greeting grt = new Greeting();

  @Test
  public void shouldGreetWithName() {
    String name = "Bob";
    assertEquals("Hello, Bob.", grt.greet(name));

  }

    @Test
    public void shouldGreetWithNull() {
        assertEquals("Hello, my friend.", grt.greet(null));

    }

    @Test
    public void shouldShoutWhenUppercase() {
        assertEquals("HELLO, JERRY!", grt.greet("JERRY"));

    }

    @Test
    public void shouldGreetTwoNames() {
        assertEquals("Hello, Bob and Jane.", grt.greet("Bob","Jane"));

    }

    @Test
    public void shouldGreetMoreNames() {
        assertEquals("Hello, Bob, Jane and Midge.", grt.greet("Bob","Jane","Midge"));

    }




}
