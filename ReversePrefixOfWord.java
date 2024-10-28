public class ReversePrefixOfWord {

  public static String reversePrefix(String s, char ch) {

    int index = -1;
    StringBuffer buffer = new StringBuffer(s);

    for (int i = 0; i < s.length(); i++) {
      if (ch == s.charAt(i)) {
        index = i;
        break;
      }
    }

    int start = 0;
    int end = index;

    while (start <= end) {
      char temp = buffer.charAt(end);
      buffer.setCharAt(end, buffer.charAt(start));
      buffer.setCharAt(start, temp);
      start++;
      end--;
    }

    return buffer.toString();
  }

  public static void main(String[] args) {
    String str = "samarthdesai";
    char ch = 'x'; 

    System.out.println("Reversed prefix : " + reversePrefix(str, ch));
  }
}
