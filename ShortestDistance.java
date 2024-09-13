public class ShortestDistance {

  public static void solution(String str, char c) {
    int[] array = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      int forward = i;
      int backward = i;

      while (backward > 0 && str.charAt(backward) != c) {
        backward--;
      }
      
      while (forward < str.length() && str.charAt(forward) != c) {
        forward++;
      }

      int forwardDistance = Math.abs(forward - i);
      int backwardDistance = Math.abs(backward - i);

      if (backward == 0) array[i] = forwardDistance;
      else if (forward == 0) array[i] = backwardDistance;
      else array[i] = Math.min(forwardDistance, backwardDistance);

    }

    for (int x : array) System.out.print(x + " ");
  }

  public static void main(String[] args) {
    String str = "loveleecode";
    char c = 'e';
    
    solution(str, c);
  }
}