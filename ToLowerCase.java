import java.util.*;

public class ToLowerCase {

  static class Solution {
    
    public String lowerCase(String str) {
  
      StringBuffer buffer = new StringBuffer("");
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
  
        if (Character.isUpperCase(ch))
          buffer.append(Character.toLowerCase(ch));
        else
          buffer.append(ch);
      }
  
      return buffer.toString();
    }
  }


  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      Solution foo = new Solution();
    
      System.out.print("Enter string : ");
      String str = input.next();

      System.out.println(foo.lowerCase(str));
    }
  }

}
