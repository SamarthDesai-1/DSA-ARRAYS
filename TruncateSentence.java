import java.util.*;

public class TruncateSentence {

  public static String truncate(String s, int k) {

    if (k >= s.length()) return s;

    StringBuffer buffer = new StringBuffer("");
    String[] array = s.split(" ");

    for (int i = 0; i <= k - 1; i++) {
      buffer.append(array[i] + " ");
    }

    return buffer.toString().trim();
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.nextLine();
      
      System.out.print("Enter K : ");
      int k = input.nextInt();

      System.out.println("Output : " + truncate(s, k));
    }
  }
}
