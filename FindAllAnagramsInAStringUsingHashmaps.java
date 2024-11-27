import java.util.*;

public class FindAllAnagramsInAStringUsingHashmaps {

  public static Vector<Integer> allAnagrams(String s, String p) {
    int start = 0;
    int end = 0;
    int count = p.length();
    Vector<Integer> vector = new Vector<>();
    HashMap<Character, Integer> map = new HashMap<>();
    
    for (int i = 0; i < p.length(); i++)
      map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);

    while (end < s.length()) {
      
      map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) - 1);


      if (map.get(s.charAt(end)) >= 0) 
        count--;

      while (count == 0) {

        if (end - start + 1 == p.length()) 
          vector.add(start);

        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);

        if (map.get(s.charAt(start)) > 0) 
          count++;

        start++;
      }

      end++;
    }

    return vector;
  } 

  public static void main(String[] args) {
    String s = "cbaebabacd";
    String p = "abc";

    System.out.println("Anagrams found at : " + allAnagrams(s, p));
  }
}
