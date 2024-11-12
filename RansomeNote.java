import java.util.*;

public class RansomeNote {

  public static boolean isConstructed(String ransomeNote, String magazine) {
    boolean result = false;

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < ransomeNote.length(); i++) {
      char c = ransomeNote.charAt(i);

      if (!map.containsKey(c)) map.put(c, 1);
      else map.put(c, map.get(c) + 1);
    }

    for (int i = 0; i < magazine.length(); i++) {
      char c = magazine.charAt(i);

      if (map.containsKey(c)) {
        int frequency = map.get(c);

        if (frequency == 1) map.remove(c);
        else map.put(c, frequency - 1);
      }
      else continue;
    }

    return map.size() == 0 ? !result : result;
  }

  public static void main(String[] args) {
   
    String ransomeNote = "ax";
    String magazine = "xayzt";

    System.out.println("RansomeNote is constructed form the letters of magazine : " + isConstructed(ransomeNote, magazine));
  }
}
