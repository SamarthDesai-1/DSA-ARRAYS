import java.util.*;

public class KeyboardRowApproachTwo {

  public static String[] isWrittenFromRow(String[] arr) {

    Vector<String> result = new Vector<>();

    String one = "qwertyuiop";
    String two = "asdfghjkl";
    String three = "zxcvbnm";

    for (int i = 0; i < arr.length; i++) {

      String[] s = arr[i].toLowerCase().split("");
      String temp = "";
      boolean shallAdd = true;

      if (one.contains(s[0])) temp = one;
      else if (two.contains(s[0])) temp = two;
      else temp = three;
      
      for (int x = 1; x < s.length; x++) {

        if (!temp.contains(s[x])) {
          shallAdd = !shallAdd;
          break;
        }
      }
      
      if (shallAdd) result.add(arr[i]);
    }

    return result.toArray(new String[result.size()]);
  }

  public static void main(String[] args) {
    String[] arr = { "Alaska", "Dad", "Peace", "Hello" };

    System.out.println(Arrays.toString(isWrittenFromRow(arr)));
  }
}
