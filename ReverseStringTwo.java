public class ReverseStringTwo {

  public static void main(String[] args) {
    String str = "samarthdesai";
    StringBuilder sb = new StringBuilder(str);
    int k = str.length();

    int start = 0;
    int end = k - 1;
    while (start <= end) {
      char temp = sb.charAt(end);
      sb.setCharAt(end, sb.charAt(start));
      sb.setCharAt(start, temp);
      start++;
      end--;
    }

    System.out.println(sb);
  }
  
}
