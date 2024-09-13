public class NumberOfLinesToWriteString {

  public static void main(String[] args) {
    int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    String str = "abcdefghijklmnopqrstuvwxyz";

    
    int sum = 0;
    int lines = 0;
    int lastLineWidth = 0;
    int lastIndex = -1;

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

    // System.out.println(width.length);
    // System.out.println("Last index : " + lastIndex);
    // System.out.println(remainingStr);
    
    for (int i = 0; i < remainingStr.length(); i++) {
      lastLineWidth = lastLineWidth + width[remainingStr.charAt(i) - 'a'];
    }

    System.out.println("Total lines : " + lines + " Width of last lines : " + lastLineWidth);
  }
  
}
