import java.util.*;

public class SumOfDigitsAfterKtimes {

  public static HashMap<Character, Integer> map = new HashMap<>();

  public static void mapFiller() {

    int x = 1;
    for (int i = 97; i <= 122; i++)
      map.put((char) i, x++);
  }

  public static int processor(String s, int k) {

    /** step : 1 */
    StringBuilder builder = new StringBuilder("");
    
    for (int i = 0; i < s.length(); i++) 
      builder.append(map.get(s.charAt(i)));

    /** step : 2 */
    int globalSum = 0;
    while (k != 0) {

      int sum = 0;
      
      for (int i = 0; i < builder.length(); i++)
        sum = sum + builder.charAt(i) - '0';

      if (builder.length() == 1) 
        return sum;

      builder = new StringBuilder(sum + "");
      globalSum = sum;

      k--;
    }

    return globalSum;
  }


  public static void main(String[] args) {
    
    String s = "iiii";
    int k = 1;

    mapFiller(); /** Fill the hashmap with the corresponding indexex from range 1 to 26 */
    System.out.println("Sum : " + processor(s, k));
  }  
}
