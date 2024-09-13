public class ValidPalindrome2 {

  public static boolean deleteOneChar(String str, int left, int right) {
    while (left < right) {
      if (str.charAt(left) == str.charAt(right)) {
        left++;
        right--;
      }
      else return false;
    }
    return true;
  }

  public static boolean isPalindrom(String str, int left, int right) {
    while (left < right) {
      if (str.charAt(left) == str.charAt(right)) {
        left++;
        right--;
      }
      else 
        return deleteOneChar(str, left + 1, right) || deleteOneChar(str, left, right - 1);
    }

    return true;
  }

  public static void main(String[] args) {
    String str = "aba";

    int left = 0;
    int right = str.length() - 1;
    System.out.println("Status of the string : " + isPalindrom(str, left, right));

  }
}
