import java.util.*;

public class FindAllAnagramsInAStringUsingArray {

  public static Vector<Integer> allAnagrams(String s, String p) {
    int start = 0;
    int end = 0;
    int count = p.length();
    Vector<Integer> vector = new Vector<>();
    
    int[] nums = new int[256];
    
    for (int i = 0; i < p.length(); i++)
      nums[p.charAt(i)]++;

    while (end < s.length()) {
      
      nums[s.charAt(end)]--;

      if (nums[s.charAt(end)] >= 0) 
        count--;

      while (count == 0) {

        if (end - start + 1 == p.length()) 
          vector.add(start);

        nums[s.charAt(start)]++;

        if (nums[s.charAt(start)] > 0) 
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