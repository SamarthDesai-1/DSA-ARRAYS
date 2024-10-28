public class NumberOfLinesToWriteString {

  public static int[] maxNumberOfLines(int[] width, String str) {

    final int ansSize = 2;
    int sum = 0;
    int lines = 0;
    int lastLineWidth = 0;
    int lastIndex = -1;
    int[] outputArray = new int[ansSize];

    for (int i = 0; i < str.length(); i++) {
      
      sum = sum + width[str.charAt(i) - 'a'];
      
      if (sum > 100) {
        i = i - 1;
        sum = 0;
        lines++;
        lastIndex = i;
      }
    }
    lines++;
    
    String remainingStr = str.substring(lastIndex + 1);
    for (int i = 0; i < remainingStr.length(); i++) 
      lastLineWidth = lastLineWidth + width[remainingStr.charAt(i) - 'a'];

    System.out.println("Total lines : " + lines + " Width of last lines : " + lastLineWidth);

    outputArray[0] = lines;
    outputArray[1] = lastLineWidth;

    return outputArray;
  }

  public static void main(String[] args) {
    int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String str = "abcdefghijklmnopqrstuvwxyz";

    int[] result = maxNumberOfLines(width, str);
    for (int x : result) 
      System.out.print(x + " ");

  }
}
