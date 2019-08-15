package dk.cngroup.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greeting {

  public String greet(String name) {
    String left = "Hello, ";
    String and = " and ";
    String regex = "\\[(\\\"\\w{1,}\\\")\\,(\\\"\\w{1,}\\\")\\]";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = name == null ? pattern.matcher("") : pattern.matcher(name);


    if(name==null) {
      name = "my friend";
    } else if(name.equals(name.toUpperCase())) {
      left = "HELLO, ";
    } else if(matcher.lookingAt()) {
      return left + matcher.group(1).substring(1,matcher.group(1).lastIndexOf('"')) + and + matcher.group(2).substring(1,matcher.group(2).lastIndexOf('"')) + ".";
    }

    return left + name + ".";
  }

  public String parseHomeSectionName(String sectionPath) {

    String parsedHomeSectionName = sectionPath;
    String startPrefix = "startseite/";
    String delimiter = "/";

    if(sectionPath.startsWith(startPrefix)) {
      parsedHomeSectionName = sectionPath.substring(startPrefix.length());

      String[] subSections = parsedHomeSectionName.split(delimiter);

      if (subSections.length==1) {
        return subSections[0];
      } else {
        return subSections[0] + delimiter + subSections[1];
      }
    }
    return parsedHomeSectionName;

  }
}
