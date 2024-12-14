public class SecondLargestDigitInAString {

  public static int findSecondLargest(String s, int max) {

    int cache = max;
    max = Integer.MIN_VALUE;

    for (int i = 0; i < s.length(); i++) {
      
      if (s.charAt(i) - '0' == cache) 
        continue;
      else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
        max = Math.max(max, s.charAt(i) - '0');
    }

    return max == Integer.MIN_VALUE ? -1 : max;
  }

  public static int largest(String s) {

    int firstLargest = findSecondLargest(s, Integer.MIN_VALUE);

    if (firstLargest == 0) 
      return -1;

    return findSecondLargest(s, firstLargest);
  } 


  public static void main(String[] args) {
    String s = "ck077777";

    System.out.println("Second largest number in this string is : " + largest(s));
  } 
}
