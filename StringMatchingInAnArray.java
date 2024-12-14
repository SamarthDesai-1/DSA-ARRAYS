import java.util.*;

public class StringMatchingInAnArray {

  public static boolean checker(String[] strs, String substring, int index) {

    for (int i = 0; i < strs.length; i++) {
      if (i == index) 
        continue;

      else if (strs[i].contains(substring)) 
        return true;
    }

    return false;
  }

  public static ArrayList<String> matchedStrings(String[] arr) {

    ArrayList<String> vector = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {

      if (checker(arr, arr[i], i))
        vector.add(arr[i]);
    }

    return vector;
  }

  public static void main(String[] args) {
    String[] arr = { "blue", "green", "bu" };

    System.out.println("Matched substring are : " + matchedStrings(arr));
  }
}