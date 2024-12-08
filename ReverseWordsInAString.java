public class ReverseWordsInAString {

  public static String reverseWords(String s) {
    s = s.trim();
    
    StringBuffer temp = new StringBuffer("");
    int i = 0;

    while (i < s.length()) {
      
      if (s.charAt(i) != ' ') 
        temp.append(s.charAt(i));
      else {
        while (s.charAt(i) == ' ') 
          i++;
        
        temp.append(" ").append(s.charAt(i));
      }

      i++;
    }

    String[] arr = temp.toString().split(" ");

    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      String cache = arr[right];
      arr[right] = arr[left];
      arr[left] = cache;

      left++;
      right--;
    }

    temp = new StringBuffer("");
    for (String str : arr)
      temp.append(str).append(" ");

    return temp.toString().trim();
  }

  public static void main(String[] args) {
    String s = "            hello                           world                 ";

    System.out.println(reverseWords(s));
  }
}
