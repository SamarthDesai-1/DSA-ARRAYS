import java.util.*;

public class DetermineIfStringHalvesAreAlike {

  public static HashSet<Character> set = new HashSet<>();
  public static int firstHalveVowel = 0;
  public static int secondHalveVowel = 0;

  public static boolean equalHalves(String s) {

    int divider = s.length() / 2;
    String firstHalve = s.substring(0, divider);
    String secondHalve = s.substring(divider, s.length());

    for (int i = 0; i < /** can take any string length to iterate because both are of equal lengths */ firstHalve.length(); i++) {
      if (set.contains(firstHalve.charAt(i))) firstHalveVowel++;
      if (set.contains(secondHalve.charAt(i))) secondHalveVowel++;
    }

    return firstHalveVowel == secondHalveVowel ? true : false;
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string with EVEN length : ");
      String s = input.next();

      char[] arr = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
      for (char c : arr) set.add(c);

      System.out.println("Result : " + equalHalves(s));
    }
  }
}
