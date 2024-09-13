public class ShortestDistanceApproachTwo {

  public static void solution(String str, char c) {
    int[] array = new int[str.length()];
    int prev = Integer.MAX_VALUE;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) prev = i;
      array[i] = prev == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.abs(i - prev);
    }

    prev = Integer.MAX_VALUE;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == c) prev = i;
      array[i] = Math.min(array[i], Math.abs(i - prev));
    }

    for (int x : array) System.out.print(x + " ");
  }

  public static void main(String[] args) {
    String str = "aaab";
    char c = 'b';
    solution(str, c);
  }
}
