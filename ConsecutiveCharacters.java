public class ConsecutiveCharacters {

  public static int solution(String str) {
    int count = 0;
    int x = 0;
    int y = 0;
    int max = Integer.MIN_VALUE;

    if (str.length() == 1)
      return 1;
    while (y < str.length()) {
      if (str.charAt(x) == str.charAt(y)) {
        count++;
        y++;
      } else {
        max = Math.max(max, count);
        count = 0;
        x = y;
      }
    }
    max = Math.max(max, count);
    return max;
  }

  public static void main(String[] args) {
    String str = "abbcccddddeeeeeffffffffffghij";
    System.out.println(solution(str));
  }
}
