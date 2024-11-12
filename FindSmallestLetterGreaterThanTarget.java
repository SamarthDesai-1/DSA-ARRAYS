public class FindSmallestLetterGreaterThanTarget {

  public static char smallestGreaterElement(char[] chars, char target) {

    for (int i = 0; i < chars.length; i++) {

      int asciiVal = chars[i];
      if (asciiVal > target) return chars[i];
    }

    return chars[0];
  }

  public static void main(String[] args) {

    char[] chars = { 'c', 'f', 'j' };
    char target = 'd';

    System.out.println("Smaller letter greater than target is : " + smallestGreaterElement(chars, target));
  }
}
