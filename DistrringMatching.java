public class DistrringMatching {

  public static void main(String[] args) {
    String s = "DDID";
    int n = s.length();
    int[] ans = new int[n + 1];
    int lo = 0;
    int hi = n;

    for (int i = 0; i < n; ++i) {
      if (s.charAt(i) == 'I') ans[i] = lo++;
      else ans[i] = hi--; 
    }
    ans[n] = lo;

    for (int x : ans) System.out.print(x + " ");
  }
}
