import java.util.*;

public class KthDistinctStringInAnArray {

  public static String kthDistinctString(String[] arr, int k) {

    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {

      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    for (String s : arr) {
      if (map.get(s) == 1)
        k--;
        if (k == 0) 
          return s;
    }

    return "";
  }

  public static void main(String[] args) {
    String[] arr = { "aaa", "aa", "a" };
    int k = 1;

    System.out.println("Kth character is : " + kthDistinctString(arr, k));
  }
}