import java.util.*;

public class CapitalizeTheTitle {
  public static String capitalize(String s) {

    String[] arr = s.split(" ");
    StringBuffer main = new StringBuffer("");

    for (int i = 0; i < arr.length; i++) {

      String cache = arr[i];
      StringBuffer b = new StringBuffer("");

      for (int j = 0; j < cache.length(); j++) {
        b.append(Character.toLowerCase(cache.charAt(j)));
      }

      if (cache.length() > 2) 
        b.setCharAt(0, Character.toUpperCase(cache.charAt(0)));
        
      main.append(" " + b.toString());
      
    }

    return main.toString().trim();
  }


  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.nextLine();

      System.out.println("Output : " + capitalize(s));
    }

  }
}