public class BuddyStrings {

  public static boolean solution(String s, String goal) {
    StringBuilder sb = new StringBuilder(s);

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < s.length() - 1 - i; j++) {
        char temp = s.charAt(j);
        sb.setCharAt(j, s.charAt(j + 1));
        sb.setCharAt(j + 1, temp);

        if (sb.toString().equals(goal)) return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String s = "aa";
    String goal = "aa";

    System.out.println(solution(s, goal));
  }
}
