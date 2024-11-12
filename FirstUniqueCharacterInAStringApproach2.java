import java.util.*;

public class FirstUniqueCharacterInAStringApproach2 {

  public static int firstUniqueChar(String s) {
    
    int Ans = -1;
    
    int[] f = new int[26];

    for (int i = 0; i < s.length(); i++) 
      f[s.charAt(i) - 'a']++;

    for (int i = 0; i < f.length; i++) 
      if (f[i] == 1) 
        return i;

    return Ans;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.next();

      System.out.println("First unique character in a string is at index : " + firstUniqueChar(s));
    }
  } 
}
