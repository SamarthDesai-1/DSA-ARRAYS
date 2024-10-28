import java.util.*;

public class ConvertDateToBinary {

  public static StringBuffer buffer = new StringBuffer();

  public static String toBinary(int n) {

    StringBuffer sb = new StringBuffer();

    while (n > 0) {
      int remainder = n % 2;
      n /= 2;
      sb.append(remainder);
    }

    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {

      System.out.println("Note : Date in a format of YYYY-MM-DD");
      System.out.print("Enter date : ");
      String s = input.next();

      int year = Integer.parseInt(s.substring(0, 4));
      int month = Integer.parseInt(s.substring(5, 7));
      int date = Integer.parseInt(s.substring(8, s.length()));
  
      buffer.append(toBinary(year)).append("-");
      buffer.append(toBinary(month)).append("-");
      buffer.append(toBinary(date));
  
      System.out.println("Date : " + s + " to binary " + buffer);    
    }
  }
}
