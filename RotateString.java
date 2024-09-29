public class RotateString {
  
  public static boolean solution(String str, String goal) {

    boolean result = false;
    int i = 1;
    StringBuilder oldString = new StringBuilder(str);
    StringBuilder newString = new StringBuilder("");
    int track = 0;

    while (i <= str.length()) {

      int fixedPosition = str.length() - 1;
      if (track == 0) {
        oldString = new StringBuilder(str);
        track = -1;
      }
      else
        oldString = new StringBuilder(newString);
      char temp = oldString.charAt(fixedPosition);
      oldString.deleteCharAt(fixedPosition);

      newString = new StringBuilder(temp + oldString.toString());
      if (newString.toString().equals(goal)) {
        result = !result;
        break;
      }
      i++;
    }

    return result;
  }

  public static void main(String[] args) {
    String str = "samarthdesai";
    String goal = "esaisamarthd";

    System.out.println(solution(str, goal));
  }

}
