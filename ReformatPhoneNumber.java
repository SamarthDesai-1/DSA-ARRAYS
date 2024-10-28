import java.util.*;

public class ReformatPhoneNumber {

  public static StringBuffer extraRemover(String s) {

    StringBuffer buffer = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ' || s.charAt(i) == '-')
        continue;
      else buffer.append(s.charAt(i));
    }

    return buffer;
  }

  public static int substringLastIndexProvider(char sign, int s) {
    return (0 + sign == '3' ? 3 : 2) >= s ? s : (0 + sign == '2' ? 2 : 3);
  }

  public static String formater(StringBuffer s) {
    StringBuffer format = new StringBuffer();

    while (s.length() != 0) {
            
      if (s.length() == 4 || s.length() == 2) {
        format.append(s.substring(0, substringLastIndexProvider('2', s.length())));
        s.delete(0, substringLastIndexProvider('2', s.length()));
        format.append("-");
      }
      else if (s.length() >= 3) {
        format.append(s.substring(0, substringLastIndexProvider('3', s.length())));
        s.delete(0, substringLastIndexProvider('3', s.length()));
        format.append("-");
      }
    }
    
    return format.toString().substring(0, format.length() - 1);
  }

  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter phone number : ");
      String unFormatNumber = input.nextLine();

      if (unFormatNumber.contains(" ") || unFormatNumber.contains("-")) {
        System.out.println("Formated phone number : " + formater(extraRemover(unFormatNumber)));
      }
      else {
        System.out.println("Formated phone number : " + formater(new StringBuffer(unFormatNumber)));
      }
    }
  }
}
