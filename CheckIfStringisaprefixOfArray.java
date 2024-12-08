public class CheckIfStringisaprefixOfArray {

  public static boolean isPrefixOfArray(String s, String[] words) {

    boolean result = true;

    if (s.length() > words.length) 
      return !result;

    StringBuffer buffer = new StringBuffer();
    for (String x : words) 
      buffer.append(x);

    int left = 0;
    int right = 0;

    while (left < s.length()) {
      
      if (s.charAt(left) != buffer.charAt(right))
        return !result;

      left++;
      right++;
    }
    
    return result;
  }

  public static void main(String[] args) {
    String s = "iloveleetcode";
    String[] words = { "apples", "i", "love", "leetcode", "austria" };

    System.out.println("String '" + s + "' is prefix of words array : " + isPrefixOfArray(s, words));
  }
}
