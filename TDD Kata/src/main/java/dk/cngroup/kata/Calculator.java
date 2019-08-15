package dk.cngroup.kata;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

  public int add(String numbers) throws Exception {
    int sum = 0;
    HashSet<String> delims = new HashSet<>();
    delims.add(",");
    delims.add("\n");

    if (numbers.length() == 0) {
      return 0;
    } else {

      String regex = "\\/\\/\\[[^0-9]{1,}]\\n";
      String delimRegex = "\\[[^0-9\\[\\]]{1,}]";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(numbers);
      StringBuilder delimB = new StringBuilder();

      if(matcher.lookingAt()) {

        pattern = Pattern.compile(delimRegex);
        matcher = pattern.matcher(numbers);
        delims.clear();
        delims.add("\n");

        while (matcher.find()) {
          delims.add(matcher.group().substring(1,matcher.group().indexOf("]")));
          delimB.append(matcher.group());
        }

        numbers = numbers.substring(3+delimB.toString().length());
      }


      if(Calculator.containsDelims(delims, numbers)) {

        String sub = numbers;
        ArrayList<String> list = new ArrayList<>();
//
        int index = Calculator.indexOfFirstDelim(delims,sub);

        while(Calculator.containsDelims(delims,sub)) {

          list.add(sub.substring(0,index));
          sub = sub.substring(index+Calculator.firstDelim(delims,sub).length());

          if(!Calculator.containsDelims(delims,sub)) {
            list.add(sub);
            break;
          }
          index = Calculator.indexOfFirstDelim(delims,sub);

        }

        StringBuilder strb = new StringBuilder();

        for ( String str: list) {
          int parseint = Integer.parseInt(str);

          if(parseint < 0) {
            strb.append(str + " ");
          } else {

            if (parseint < 1001) sum += Integer.parseInt(str);

          }

        }

        if(!strb.toString().isEmpty()) {
          System.out.println("negatives not allowed " + strb.toString());
          throw new Exception();
        }


      } else {
        sum = Integer.parseInt(numbers);
      }

        return sum;
    }


  }

  public static boolean containsDelims(HashSet<String> delims, String string) {
    for (String str : delims) {
      if(string.contains(str)) return true;
    }
    return false;
  }

  public static int indexOfFirstDelim(HashSet<String> delims, String string) {
    int minIndex = string.length() - 1;
    for (String str : delims) {
      if (string.indexOf(str) > 0) {
        if (string.indexOf(str) < minIndex)
          minIndex = string.indexOf(str);
      }
    }
    return minIndex;
  }

    public static String firstDelim(HashSet<String> delims, String string) {
      String fstDelim = "";
      int minIndex = string.length() - 1;

      for (String str : delims) {
        if (string.indexOf(str) > -1) {
          if (string.indexOf(str) < minIndex) {
            minIndex = string.indexOf(str);
            fstDelim = str;
          }
        }
      }

      return fstDelim;

    }


  }

