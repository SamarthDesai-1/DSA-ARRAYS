public class ReverseOnlyLetters {

  public static void main(String[] args) {
    String s = "a-bC-dEf-ghIj";

    int i = 0;
    int j = s.length() - 1;
    char[] ch = s.toCharArray();
    while (i < j) {
      if (!Character.isLetter(ch[i])) i++;
      else if (!Character.isLetter(ch[j])) j--;
      else {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        i++;
        j--;
      }
    }

    System.out.println(new String(ch));
  }
}

