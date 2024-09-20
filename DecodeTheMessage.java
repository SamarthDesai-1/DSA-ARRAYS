import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DecodeTheMessage {

  public static String solution(String key, String message) {
    HashSet<Character> set = new HashSet<>();

    for (int i = 0; i < key.length(); i++) {
      char ch = key.charAt(i);
      if (Character.isLetter(ch)) set.add(ch);
    }

    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < key.length(); i++) if (Character.isLetter(key.charAt(i))) sb.append(key.charAt(i));

    ArrayList<Character> list = new ArrayList<>();
    for (int i = 0; i < sb.length(); i++) {
      if (set.contains(sb.charAt(i))) {
        set.remove(sb.charAt(i));
        list.add(sb.charAt(i));
      }
    }
    
    HashMap<Character, Character> map = new HashMap<>();
    int x = 97;
    for (int i = 0; i < list.size(); i++) map.put(list.get(i), (char) x++);

    StringBuilder ans = new StringBuilder("");
    for (int i = 0; i < message.length(); i++) {
      if (map.containsKey(message.charAt(i))) ans.append(map.get(message.charAt(i)));
      else if (message.charAt(i) == ' ') ans.append(" ");
    }

    return ans.toString();
  }

  public static void main(String[] args) {
    String key = "eljuxhpwnyrdgtqkviszcfmabo";
    String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

    String ans = solution(key, message);
    System.out.println(ans);
  }
}
