package dk.cngroup.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorBetaTest {

  private CalculatorBeta calc = new CalculatorBeta();

  @Test
  public void shouldReturn0WhenDefault() throws Exception {
    assertEquals(0,calc.add(""));
  }

  @Test
  public void shouldReturnNumWhenOneNumber() throws Exception {
    assertEquals(2,calc.add("2"));
    assertEquals(8,calc.add("8"));

    assertEquals(24,calc.add("24"));
    assertEquals(245,calc.add("245"));

  }

  @Test
  public void shouldReturnSum0WhenTwoNumbers() throws Exception {
    assertEquals(5,calc.add("2,3"));
    assertEquals(59,calc.add("24,35"));
    assertEquals(356,calc.add("245,111"));
    assertEquals(467,calc.add("245,222"));

  }

  @Test
  public void shouldReturnSumWhenUnlimitedNumbers() throws Exception {
    assertEquals(10,calc.add("2,3,5"));
    assertEquals(80,calc.add("24,35,10,11"));
    assertEquals(359,calc.add("245,111,1,1,1"));
    assertEquals(456,calc.add("245,111,10,20,30,40"));

  }

  @Test
  public void shouldReturnSumWhenNewLineDelimiter() throws Exception {
    assertEquals(10,calc.add("2\n3,5"));
    assertEquals(80,calc.add("24,35\n10,11"));
    assertEquals(359,calc.add("245,111,1\n1,1"));
    assertEquals(456,calc.add("245\n111\n10\n20\n30\n40"));

  }

  @Test
  public void shouldSupportCustomDelimiter() throws Exception {
    assertEquals(10,calc.add("//:\n2\n3:5"));
    assertEquals(80,calc.add("//;\n24;35\n10;11"));
    assertEquals(359,calc.add("//>\n245>111>1\n1>1"));
    assertEquals(456,calc.add("//&\n245\n111\n10\n20\n30\n40"));

  }

  @Test
  public void shouldThrowExceptionWhenNegatives() {
    try {
      calc.add("//:\n2\n3:-5");
    } catch (Exception e) {
      assertEquals("negatives not allowed, -5", e.getMessage());
    }

    try {
      calc.add("24,35\n-10,11");
    } catch (Exception e) {
      assertEquals("negatives not allowed, -10", e.getMessage());
    }

    try {
      calc.add("-10");
    } catch (Exception e) {
      assertEquals("negatives not allowed, -10", e.getMessage());
    }


  }



}
