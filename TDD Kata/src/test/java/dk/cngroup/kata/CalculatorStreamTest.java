package dk.cngroup.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorStreamTest {

  private CalculatorStream calc = new CalculatorStream();

  @Test
  public void shouldReturn0WhenDefault() throws Exception {

    assertEquals(0,calc.add(""));
  }

  @Test
  public void shouldReturnSumWhenOneNum() throws Exception  {

    assertEquals(1,calc.add("1"));
    assertEquals(12,calc.add("12"));
    assertEquals(123,calc.add("123"));

  }

  @Test
  public void shouldReturnSumWhenTwoNums() throws Exception  {

    assertEquals(3,calc.add("1,2"));
    assertEquals(37,calc.add("24,13"));
    assertEquals(372,calc.add("240,132"));

  }

  @Test
  public void shouldReturnSumWhenUnlimitedNums() throws Exception  {

    assertEquals(4,calc.add("1,2,1"));
    assertEquals(67,calc.add("24,13,10,20"));
    assertEquals(472,calc.add("240,132,10,20,30,40"));

  }


  @Test
  public void shouldReturnSumWhenNewLines() throws Exception {

    assertEquals(4,calc.add("1\n2,1"));
    assertEquals(67,calc.add("24,13\n10,20"));
    assertEquals(472,calc.add("240\n132\n10\n20\n30\n40"));

  }

  @Test
  public void shouldSupportDifferentDelims() throws Exception  {

    assertEquals(4,calc.add("//:\n1\n2:1"));
    assertEquals(67,calc.add("//&\n24&13\n10&20"));
    assertEquals(472,calc.add("//%\n240\n132\n10\n20\n30\n40"));

  }

  @Test
  public void shouldThrowExceptionWhenNegatives() throws Exception  {

    try{
      calc.add("//:\n-1\n2:1");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -1", e.getMessage());
    }

    try{
      calc.add("//&\n24&-13\n-10&20");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -13 -10", e.getMessage());
    }

    try{
      calc.add("//%\n240\n132\n-10\n-20\n-30\n-40");
    } catch (Exception e) {
      assertEquals("negatives not allowed: -10 -20 -30 -40", e.getMessage());
    }


  }

  @Test
  public void shouldIgnoreMoreThan1000() throws Exception  {

    assertEquals(4,calc.add("//:\n1\n2:1:1001"));
    assertEquals(67,calc.add("//&\n24&13\n10&20&5461"));
    assertEquals(472,calc.add("//%\n240\n132\n10\n20\n30\n40\n4568"));

  }

  @Test
  public void shouldSupportDelimsOfAnyLength() throws Exception  {

    assertEquals(4,calc.add("//::\n1\n2::1::1001"));
    assertEquals(67,calc.add("//&&&\n24&&&13\n10&&&20&&&5461"));
    assertEquals(472,calc.add("//%%%%\n240\n132\n10\n20\n30\n40\n4568"));

  }












}
