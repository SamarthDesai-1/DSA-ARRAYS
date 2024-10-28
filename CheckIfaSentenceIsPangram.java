public class CheckIfaSentenceIsPangram {

  public static boolean isPangramOne(String s) {

    String main = "abcdefghijklmnopqrstuvwxyz";
    int count = 0;

    for (int i = 0; i < main.length(); i++) {
      if (s.contains(main.charAt(i) + ""))
        count++;
    }

    return count == 26 ? true : false;
  }

  public static boolean isPangramTwo(String s) {

    String main = "abcdefghijklmnopqrstuvwxyz";
    
    for (int i = 0; i < main.length(); i++) {
      if (!s.contains(main.charAt(i) + ""))
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "thequickbrownfoxjumpsoverthelazydog";

    System.out.println(isPangramOne(s) + " " + isPangramTwo(s));
  }
  
}
