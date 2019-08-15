package dk.cngroup.kata;

import static org.junit.Assert.assertEquals;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Test;

public class CalculatorTest {

  private Calculator calc = new Calculator();

  @Test
  public void shouldReturn0WhenDefault() throws Exception {
    assertEquals(0,calc.add(""));

  }

  @Test
  public void shouldReturnNumWhenOneNum() throws Exception {
    assertEquals(1,calc.add("1"));
    assertEquals(11,calc.add("11"));
    assertEquals(111,calc.add("111"));

  }

  @Test
  public void shouldReturnSumWhenTwoNums() throws Exception {
    assertEquals(2,calc.add("1,1"));
    assertEquals(22,calc.add("11,11"));
    assertEquals(222,calc.add("111,111"));

  }

  @Test
  public void shouldReturnSumWhenUnknownNums() throws Exception {
    assertEquals(3,calc.add("1,1,1"));
    assertEquals(44,calc.add("11,11,11,11"));
    assertEquals(555,calc.add("111,111,111,111,111"));

  }

  @Test
  public void shouldReturnSumWhenNewLines() throws Exception {
    assertEquals(3,calc.add("1\n1,1"));
    assertEquals(44,calc.add("11,11\n11\n11"));
    assertEquals(555,calc.add("111\n111\n111\n111\n111"));

  }

  @Test
  public void shouldReturnSumWhenDiffDelim() throws Exception {
    assertEquals(3,calc.add("//[:]\n1\n1:1"));
    assertEquals(44,calc.add("//[;]\n11;11\n11;11"));
    assertEquals(555,calc.add("//[*]\n111\n111\n111\n111\n111"));

  }

  @Test(expected = Exception.class)
  public void shouldThrowExceptionWhenNegatives() throws Exception {
//    assertEquals(3,calc.add("//[:]\n-1\n1:1"));
    assertEquals(44,calc.add("//[;]\n11;-11\n11;11"));
//    assertEquals(555,calc.add("//[*]\n111\n111\n-111\n111\n111"));

  }

  @Test
  public void shouldIgnoreNums1000Plus() throws Exception {
    assertEquals(2,calc.add("//[:]\n1001\n1:1"));
    assertEquals(33,calc.add("//[;]\n11;1002\n11;11"));
    assertEquals(444,calc.add("//[*]\n111\n111\n1003\n111\n111"));

  }


  @Test
  public void shouldReturnSumWhenDiffDelimLen() throws Exception {
    assertEquals(2,calc.add("//[::]\n1001\n1::1"));
    assertEquals(33,calc.add("//[;;;]\n11;;;1002\n11;;;11"));
    assertEquals(444,calc.add("//[####]\n111\n111\n1003####111\n111"));

  }

  @Test
  public void shouldReturnSumWhenDiffDelimsAndLen() throws Exception {
    assertEquals(2,calc.add("//[::][;;]\n1001\n1::1"));
    assertEquals(33,calc.add("//[;;;][::]\n11;;;1002\n11::11"));
    assertEquals(444,calc.add("//[####][$$$][@@]\n111$$$111\n1003####111@@111"));

  }

}
