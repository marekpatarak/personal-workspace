package dk.cngroup.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greeting {

  public String greet(String ... name) {
    String greeting = "Hello, ";
    String output = name == null ? "my friend" : "";

    if (output.isEmpty()) {
      if (name.length == 1) {
        output = name[0];
      } else {
        for(int i = 0; i < name.length - 1; i++) {
          output += name[i];
          if(i < name.length - 2) output += ", ";
        }
        output += " and " + name[name.length-1];
      }
    }


    return output.toUpperCase().equals(output) ? (greeting + output + "!").toUpperCase() : greeting + output + ".";
  }

}
