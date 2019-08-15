package dk.cngroup.kata;

import com.sun.deploy.util.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {

  private static final Map<String, String> specialCharsBlacklist;

  static {
    specialCharsBlacklist = new HashMap<>();
    specialCharsBlacklist.put("&", "&amp;");
    specialCharsBlacklist.put(">", "&gt;");
    specialCharsBlacklist.put("<", "&lt;");
    specialCharsBlacklist.put("\'", "&apos;");
    specialCharsBlacklist.put("\"", "&quot;");

  }

  public static void main(String[] args) {
    String test = "<?xml version=\"1.0\"?>\n<rss xmlns:atom=\"http://www.w3.org/2005/Atom\" xmlns:media=\"http://search.yahoo.com/mrss/\" version=\"2.0\">\n<channel>\n<title>kulturfernsehen aus & Magdeburg - frei und unabh&#xE4;ngig</title>\n<description><![CDATA[kulturmd Stadtfernsehen Magdeburg Literatur, Musik, Kunst, Lifestile, Infotainment]]></description>\n<link>http://www.kulturmd.de/</link>\n<lastBuildDate>Wed, 22 Aug 2018 09:56:44 GMT</lastBuildDate>\n<language>de-de</language>\n<item>\n<title>1050 Jahre > Erzbistum Magdeburg </title>\n<link>http://www.kulturmd.de/index.php/106-themen/fuer-demokratie/535-1050-jahre-bistum-magdeburg</link>\n<description><![CDATA[Eine Annäherung Wenn man so durch die Straßen läuft. Überall findet man Kirchen. Steinernde Zeugen. Manche 1000 Jahre alt. einige nur wenige Hundert Jahre. Manche sind neu. Von anderen gibt es nur noch Fragmente oder Modelle aus Bronze. Wie die meisten in der DDR bin ich in einer eher der Kirche abgeneigten Umgebung aufgewachsen. Dennoch ist Kirche für mich allgegenwärtig. Ostern, Weihnachten, Pfingsten, Christi Himmelfahrt oder Vatertag. Doch was bedeutet Kirche heute und was hat Religion mit mir zu tun?]]></description>\n<category>News</category>\n<pubDate>Wed, 11 Jul 2018 09:52:47 +0000</pubDate>\n<media:content>\n<media:thumbnail />\n<media:copyright>kulturmd e.K. Bernd Schallenberg</media:copyright>\n<media:title>1050 Jahre Erzbistum Magdeburg </media:title>\n<media:description>1050 Jahre Erzbistum Magdeburg  -Eine Ann&#xE4;herung</media:description>\n</media:content>\n<media:content>http://www.kulturmd.de/images/030718_Bistum_1.png</media:content>\n</item>\n</channel>\n</rss>";
    String test2 = "1050 Jahre &amp; Erzbistum & Magdeburg &";

    test = replaceSpecialCharsInString(test2);
  }

  private static String replaceSpecialCharsInString(String input) {

    StringBuilder strb = new StringBuilder(input);
    for (String specChar : specialCharsBlacklist.keySet()) {
      if (input.contains(String.valueOf(specChar))) {

        String temp = input;
        int diff = 0;
        while (temp.contains(specChar)) {
          if (specChar.equals("&")) {
            String regex = "&#?[\\w]{2,};";
            Pattern patternWrapper = Pattern.compile(regex);
            int index = temp.indexOf(specChar);
            Matcher matcher = patternWrapper.matcher(temp.substring(index));

            if (!matcher.lookingAt()) {
              diff = strb.indexOf(temp);
              int len = temp.replaceFirst(specChar,specialCharsBlacklist.get(specChar)).length() - temp.length();
              temp = temp.replaceFirst(specChar,specialCharsBlacklist.get(specChar));
              strb.replace(diff, strb.toString().length(), temp);
              temp = temp.substring(index + len + 1);
            } else {
              String str = matcher.group(0);
              temp = temp.substring(index + matcher.group(0).length());
            }

          } else {

          }
        }
      }
    }
    return strb.toString();

  }
}
