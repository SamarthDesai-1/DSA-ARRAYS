import java.util.*;

public class MergeStringAlternately {

  public static String mergeAlternate(String w1, String w2) {

    StringBuffer buffer = new StringBuffer("");

    char whichStr = ' ';
    int traverseLength = 0;

    whichStr = w1.length() > w2.length() ? '2' : '1';
    traverseLength = w1.length() > w2.length() ? w2.length() : w1.length();

    int indexer = 0;
    for (int i = 0; i < traverseLength; i++) {
      buffer.append(w1.charAt(i)).append(w2.charAt(i));
      indexer++;
    }

    buffer.append(whichStr == '1' ? w2.substring(indexer, w2.length()) : w1.substring(indexer, w1.length()));

    return buffer.toString();
  }

  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string one : ");
      String w1 = input.next();
      System.out.print("Enter string two : ");
      String w2 = input.next();

      System.out.println("Merged alternate strings : " + mergeAlternate(w1, w2));
    }
  }
}


