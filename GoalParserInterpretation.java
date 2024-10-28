import java.util.Scanner;

public class GoalParserInterpretation {

  public static String goalParser(String s) {

    StringBuffer buffer = new StringBuffer("");

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == '(') {

        if (s.charAt(i + 1) == ')') {
          buffer.append("o");
          i++;
        }
        else {
          buffer.append("al");
          i += 3;
        }
      }
      else if (s.charAt(i) == 'G') buffer.append(s.charAt(i));
    }

    return buffer.toString(); 
  }

  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.next();

      System.out.println("Goal parser interpretation : " + goalParser(s));
    }
  }
}
