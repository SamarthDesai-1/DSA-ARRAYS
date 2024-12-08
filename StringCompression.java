public class StringCompression {

  public static void digitSeperator(int digit, int count, StringBuffer ans) {
    if (digit >= 10) {

      StringBuilder sb = new StringBuilder();
      while (digit > 0) {
        sb.append(digit % 10);
        digit /= 10;
      }

      sb.reverse();
      for (int j = 0; j < sb.length(); j++) 
        ans.append(sb.charAt(j));

    }
    else {
      if (digit != 1) 
        ans.append(digit);
    }
  }
  
  public static void compress(char[] s) {
    StringBuffer ans = new StringBuffer(s[0] + "");
    int i = 1;

    int count = 0;
    int digit = 0;
    while (i < s.length) {

      if (s[i] == s[i - 1]) 
        count++;
      else if (s[i] != s[i - 1]) { 
        digit = 0;
        digit = ++count;
        count = 0;

        digitSeperator(digit, count, ans);

        ans.append(s[i]);
      }

      i++;
    }

    digit = 0;
    digit = ++count;
    count = 0;

    digitSeperator(digit, count, ans);

    updateInputArray(s, ans, ans.length());
  }

  public static void updateInputArray(char[] s, StringBuffer ans, int length) {
    for (int i = 0; i < length; i++) 
      s[i] = ans.charAt(i);

    
    System.out.print("Compressed string : ");
    for (int x = 0; x < length; x++)
      System.out.print(s[x]);
  }

  public static void main(String[] args) {
    char[] arr = { 'a', 'a', 'b', '$', '^', '^', '*', '*', '*', '1', 'c', 'c', 'c', '%', '%', '&', '@' };

    compress(arr);
  }
}
