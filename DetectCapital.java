import java.util.*;

public class DetectCapital {

  public static boolean senseCapital(String s) {

    int n = s.length();
    boolean output = true;

    int allLettersCapital = 0;
    int allLettersSmall = 0;
    int onlyFirstLetterCapital = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isUpperCase(ch)) allLettersCapital++;
      else if (Character.isLowerCase(ch)) allLettersSmall++;
    }

    if (allLettersCapital == n || allLettersSmall == n) return output;
    else if (Character.isUpperCase(s.charAt(onlyFirstLetterCapital))) 
      if (allLettersSmall == n - 1) 
        return output;
      
    return !output;
  }


  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.next();

      System.out.println("Output is : " + senseCapital(s));
    }
  }
}