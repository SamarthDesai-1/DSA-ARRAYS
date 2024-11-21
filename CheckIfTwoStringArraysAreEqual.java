public class CheckIfTwoStringArraysAreEqual {

  public static boolean isStringsEqual(String[] word1, String[] word2) {
    boolean result = false;

    StringBuffer one = new StringBuffer();
    for (int i = 0; i < word1.length; i++) 
      one.append(word1[i]);

    StringBuffer two = new StringBuffer();
    for (int i = 0; i < word2.length; i++) 
      two.append(word2[i]);

    return one.toString().equals(two.toString()) ? !result : result;
  } 

  public static void main(String[] args) {
    String[] word1 = { "ab", "c" };
    String[] word2 = { "a", "bc" };

    System.out.println(isStringsEqual(word1, word2));
  }
}