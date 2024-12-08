public class IsSubsequence {

  public static boolean isSubsequence(String s, String t) {
    int i = 0;
    int j = 0;
    int index = 0;

    while (i < s.length()) {
      
      char c = s.charAt(i);

      j = index;

      while (j < t.length()) {
        if (t.charAt(j) == c) {
          index = j + 1;
          break;
        }
        j++;
      }

      if (i < s.length() && j >= t.length())
        return false;

      i++;
    }
    
    return true;
  }

  public static void main(String[] args) {
    String s = "abc";
    String t = "ahgdfgthygdterfghtujbhyilkc";

    System.out.println(s + " is a subsequence of " + t + " : " + isSubsequence(s, t));
  }
}
