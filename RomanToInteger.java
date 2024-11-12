import java.util.*;

public class RomanToInteger {

  public static int toInteger(String s) {

    int total = 0;
    int n = s.length();

    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    for (int i = 0; i < n; i++) {
      
      if (i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        total -= map.get(s.charAt(i));
      }
      else total += map.get(s.charAt(i));
    }

    return total;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter Roman Number : ");
      String s = input.next();

      System.out.println("ROMAN " + s + " to INTEGER is : " + toInteger(s));
    }
  } 
}
