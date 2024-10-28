import java.util.*;

public class TwoWordSummationEqualWord {

  public static HashMap<Character, Integer> map = new HashMap<>();

  public static void mapFiller() {

    int indexer = 0;
    for (int i = 97; i <= 106; i++) 
      map.put((char) i, indexer++);
  }

  public static int toInteger(String x) {

    StringBuffer buffer = new StringBuffer("");
    for (int i = 0; i < x.length(); i++) 
      buffer.append(map.get(x.charAt(i)));

    return Integer.parseInt(buffer.toString());
  }

  public static boolean addition(int firstInt, int secondInt, int targetInt) {
    
    int carry = 0;
    int p = 1;
    int returnVal = 0;

    while (firstInt > 0 || secondInt > 0 || carry > 0) {
      int digitOne = firstInt % 10;
      int digitTwo = secondInt % 10;

      firstInt /= 10;
      secondInt /= 10;

      int digit = digitOne + digitTwo + carry;

      carry = digit / 10;
      digit %= 10;

      returnVal += digit * p;
      p *= 10;
    }

    return returnVal == targetInt ? true : false;
  }

  public static void main(String[] args) {
    mapFiller();

    String firstWord = "acb";
    String secondWord = "cba";
    String targetWord = "cdb";

    int firstInt = toInteger(firstWord);
    int secondInt = toInteger(secondWord);
    int targetInt = toInteger(targetWord);

    System.out.println("Output : " + addition(firstInt, secondInt, targetInt)); 
  }
}
