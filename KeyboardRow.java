import java.util.*;

public class KeyboardRow {

  public static Vector<String> isWrittenFromRow(String[] arr) {

    Vector<String> result = new Vector<>();
    HashMap<Character, Integer> map = new HashMap<>();
    String one = "qwertyuiop";
    String two = "asdfghjkl";
    String three = "zxcvbnm";

    for (int i = 0; i < one.length(); i++) map.put(one.charAt(i), 1);
    for (int i = 0; i < two.length(); i++) map.put(two.charAt(i), 2);
    for (int i = 0; i < three.length(); i++) map.put(three.charAt(i), 3);

    for (int i = 0; i < arr.length; i++) {

      String s = arr[i].toLowerCase();

      boolean shallAdd = true;
      for (int j = 0; j < s.length(); j++) {
        if (j < s.length() - 1 && map.get(s.charAt(j)) != map.get(s.charAt(j + 1))) {
          shallAdd = !shallAdd;
          break;
        }
      }

      if (shallAdd) result.add(arr[i]);
    }

    return result;
  }

  public static void main(String[] args) {
    String[] arr = { "Alaska", "Dad", "Peace", "Hello" };

    System.out.println(isWrittenFromRow(arr));
  }
}
