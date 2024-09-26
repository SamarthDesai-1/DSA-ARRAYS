public class AddTwoStrings {

  public static void solution(String one, String two) {
    StringBuilder sb = new StringBuilder();
    int i = one.length() - 1;
    int j = two.length() - 1;
    int carry = 0;

    char ch = one.length() > two.length() ? 'i' : 'j';

    while ((ch == 'i' ? i : j) >= 0) {
      int digit = carry;
      if (i >= 0) digit += one.charAt(i) - '0';
      if (j >= 0) digit += two.charAt(j) - '0';

      carry = digit / 10;
      digit %= 10;

      sb.append(digit);
      i--;
      j--;
    }
    if (carry != 0) sb.append(carry);
    System.out.println(sb.reverse());
  }

  public static void main(String[] args) {
    String one = "894156";
    String two = "1";
    solution(one, two);
  }
}
