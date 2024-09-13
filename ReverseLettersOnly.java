public class ReverseLettersOnly {

  public static boolean isAlphabet(char ch) {
    if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) return true;
    return !true;
  }

  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Test1ng-Leet=code-Q!");
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {

      while (left < right && !isAlphabet(str.charAt(left))) {
        left++;
      }
      while (left < right && !isAlphabet(str.charAt(right))) {
        right--;
      }

      char temp = str.charAt(right);
      str.setCharAt(right, str.charAt(left));
      str.setCharAt(left, temp);

      left++;
      right--;
    }

    System.out.println(str);

  }
  
}
