package dk.cngroup.kata;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.*;


import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;

public class AssertJTest {

    @Test
    public void assIsEqualTest() {
      assertThat("string").isEqualTo("string");
    }

    @Test
    public void assIsBeforeTest() {
      Date today = new Date();
      Date birthday = new Date(90,6,30);

      assertThat(birthday).isBefore(today);
    }

    @Test
    public void assChainTest() {

      ArrayList list = new ArrayList();
      list.add("daco");
      assertThat(list).isNotNull().isNotEmpty();

    }

    @Test
    public void assContainsTest() {

      ArrayList list = new ArrayList();
      list.add("daco");

      assertThat(list).contains("daco",atIndex(0)).containsOnlyOnce("daco").doesNotContain("inedaco");

    }

    @Test
    public void assDateTest() {

      Date today = new Date();
      assertThat(today).isBeforeYear(2020).isAfterYear(2000);

    }




}
