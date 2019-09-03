package dk.cngroup.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorPrimTest {

  private CalculatorPrim calc = new CalculatorPrim();

  @Test
  public void shouldReturn0WhenDefault() throws Exception{

    assertEquals(0,calc.add(""));
  }

  @Test
  public void shouldReturnSumWhenOneNum() throws Exception{
    assertEquals(1,calc.add("1"));
    assertEquals(12,calc.add("12"));
    assertEquals(123,calc.add("123"));


  }

  @Test
  public void shouldReturnSumWhenTwoNum() throws Exception{
    assertEquals(3,calc.add("1,2"));
    assertEquals(24,calc.add("12,12"));
    assertEquals(246,calc.add("123,123"));


  }

  @Test
  public void shouldReturnSumWhenUnlimitedNums() throws Exception{
    assertEquals(3,calc.add("1,1,1"));
    assertEquals(10,calc.add("1,2,3,4"));
    assertEquals(250,calc.add("10,20,30,40,50,100"));


  }

  @Test
  public void shouldReturnSumWhenNewLines() throws Exception{
    assertEquals(3,calc.add("1\n1,1"));
    assertEquals(10,calc.add("1,2\n3,4"));
    assertEquals(250,calc.add("10\n20\n30\n40\n50\n100"));


  }

  @Test
  public void shouldSupportDifferentDelims() throws Exception{
    assertEquals(3,calc.add("//;\n1\n1;1"));
    assertEquals(10,calc.add("//:\n1:2\n3:4"));
    assertEquals(250,calc.add("//$\n10\n20\n30\n40\n50\n100"));


  }

  @Test
  public void shouldThrowExceptionWhenNegativeNumber() {
    try{
      calc.add("-1\n1,1");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -1 ", e.getMessage());
    }

    try{
      calc.add("-1,-2\n3,4");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -1 -2 ", e.getMessage());
    }

    try{
      calc.add("-10\n-20\n-30\n40\n50\n100");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -10 -20 -30 ", e.getMessage());
    }

    try{
      calc.add("//;\n-1\n1;1");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -1 ", e.getMessage());
    }

    try{
      calc.add("//:\n-1:-2\n3:4");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -1 -2 ", e.getMessage());
    }

    try{
      calc.add("//$\n-10\n-20\n-30\n40\n50\n100");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -10 -20 -30 ", e.getMessage());
    }

  }

  @Test
  public void shouldIgnoreMorethan1000() throws Exception{
    assertEquals(3,calc.add("1\n1,1,1001"));
    assertEquals(10,calc.add("1,2\n3,4,2568"));
    assertEquals(250,calc.add("10\n20\n30\n40\n50\n100\n4563"));
    assertEquals(3,calc.add("//;\n1\n1;1;1235"));
    assertEquals(10,calc.add("//:\n1:2\n3:4:7899"));
    assertEquals(250,calc.add("//$\n10\n20\n30\n40\n50\n100\n78567"));

  }

  @Test
  public void shouldAcceptDelimsAnyLenghtIgnoreMorethan1000() throws Exception{
    assertEquals(3,calc.add("//;:\n1\n1;:1;:1235"));
    assertEquals(10,calc.add("//%$^\n1%$^2\n3%$^4%$^7899"));
    assertEquals(250,calc.add("//$%^&^\n10\n20\n30\n40\n50\n100\n78567"));

  }









}
