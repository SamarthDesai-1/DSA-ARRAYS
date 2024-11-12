public class FindSmallestLetterGreaterThanTargetUsingBinarySearch {

  public static char smallestGreaterElement(char[] chars, char target) {

    int start = 0;
    int end = chars.length - 1;
    char Ans = chars[0];

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if ((int) chars[mid] > (int) target) {
        Ans = chars[mid];
        end = mid - 1;
      } 
      else start = mid + 1;
    }

    return Ans;
  }

  public static void main(String[] args) {
    char[] chars = { 'c', 'f', 'j' };
    char target = 'c';

    System.out.println("Smaller letter greater than target is : [ " + smallestGreaterElement(chars, target) + " ]");
  }
}
