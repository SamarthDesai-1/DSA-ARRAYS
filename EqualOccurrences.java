import java.util.Collection;
import java.util.HashMap;

public class EqualOccurrences {

  public static boolean equalOccurrences(HashMap<Character, Integer> hm) {
    Collection<Integer> values = hm.values();
    Integer[] array = values.toArray(new Integer[0]);
    int[] resultArray = new int[array.length];

    for (int i = 0; i < array.length; i++) 
      resultArray[i] = array[i];
    

    for (int i = 0; i < resultArray.length; i++) 
      if (i < resultArray.length - 1 && resultArray[i] != resultArray[i + 1]) return false;
    
    return true;
  }

  public static void main(String[] args) {
    String str = "abcabcabc";

    HashMap<Character, Integer> hm = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      if (!hm.containsKey(str.charAt(i))) hm.put(str.charAt(i), 1);
      else hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
    }

    System.out.println(equalOccurrences(hm));
  }  
}
