public class ShuffleString {

  public static String shuffle(String s, int[] indices) {

    char[] array = new char[indices.length];

    for (int i = 0; i < indices.length; i++) 
      array[indices[i]] = s.charAt(i);

    StringBuffer buffer = new StringBuffer();

    return buffer.append(array).toString();
  }

  public static void main(String[] args) {
    String s = "codeleet";
    int[] indices = { 4, 5, 6, 7, 0, 1, 2, 3 };

    System.out.println("Original string is : " + shuffle(s, indices) + " and shuffle string is : " + s);
  }
}
