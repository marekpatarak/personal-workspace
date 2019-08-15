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
  public void shouldGreetWithFriend() {
    String name = null;
    assertEquals("Hello, my friend.", grt.greet(name));

  }

  @Test
  public void shouldShoutWhenUppercase() {
    String name = "JERRY";
    assertEquals("HELLO, JERRY.", grt.greet(name));

  }

  @Test
  public void shouldGreetTwoNames() {
    String name = "[\"Jill\",\"Jane\"]";
    assertEquals("Hello, Jill and Jane.", grt.greet(name));

  }

  @Test
  public void shouldReturnSection() {
    String name = "startseite/regional/nürnberg/ehrlichberaten";
    String name1 = "startseite/regional";
    String name2 = "konomrd/regional";
    String name3 = "startseite/regional/konomrd";


    assertEquals("regional/nürnberg", grt.parseHomeSectionName(name));
    assertEquals("regional", grt.parseHomeSectionName(name1));
    assertEquals("konomrd/regional", grt.parseHomeSectionName(name2));
    assertEquals("regional/konomrd", grt.parseHomeSectionName(name3));

  }


}
