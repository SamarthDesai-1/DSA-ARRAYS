import java.util.*;

public class MaximumNumberOfWordYouCanTypw {

  public static int maximumType(String s, String brokenLetters) {

    String[] arr = s.split(" ");
    int ans = arr.length;
    
    for (int i = 0; i < arr.length; i++) {
      boolean flag = false;
      String x = arr[i];

      HashSet<Character> set = new HashSet<>();
      for (int j = 0; j < x.length(); j++) {
        set.add(x.charAt(j));
      }

      for (int k = 0; k < brokenLetters.length(); k++) {
        if (set.contains(brokenLetters.charAt(k))) {
          if (flag == false) {
            ans = ans - 1;
            flag = !flag;
            break;
          }
        }
      }

    }
    return ans;
  }
  
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      
      System.out.print("Enter string : ");
      String s = input.nextLine();
      System.out.print("Enter broken letters : ");
      String brokenLetters = input.next();
  
      System.out.println("Maximum letter type is : " + maximumType(s, brokenLetters));
    }
  }
}
