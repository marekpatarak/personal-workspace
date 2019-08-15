/*
 * Copyright (c) 2018. FOCUS Online Group GmbH. All rights reserved.
 */

package dk.cngroup.commonproblems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class CommonProblemsTest {

  private CommonProblems cp = new CommonProblems();

  @Test
  public void sumForLoopTest() {
    assertEquals(6,cp.sumForLoop(new int[] {1,2,3}));
  }

  @Test
  public void sumWhileLoopTest() {
    assertEquals(6,cp.sumWhileLoop(new int[] {1,2,3}));
  }

  @Test
  public void sumRecursionTest() {
    assertEquals(10,cp.sumRecursion(new int[] {1,2,3,4}));
  }

  @Test
  public void combineListsTest() {
    assertArrayEquals(new char[] {'1','a','2','b','3','c','4','d'},cp.combineLists(new char[]{'1','2','3','4'},new char[] {'a','b','c','d'}));
  }


}
