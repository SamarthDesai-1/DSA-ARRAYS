public class DifferenceOfArrays {

  static class Solution {

    public void solution(int[] a1, int[] a2) {
      int n1 = a1.length;
      int n2 = a2.length;

      int[] diff = new int[n2];
      int carry = 0;
      int i = a1.length - 1;
      int j = a2.length - 1;
      int k = diff.length - 1;

      while (k >= 0) {
        int d = 0;
        int a1Val = i >= 0 ? a1[i] : 0;

        if (a2[j] + carry >= a1Val) {
          d = a2[j] + carry - a1Val;
          carry = 0;
        }
        else {
          d = a2[j] + carry + 10 - a1Val;
          carry = -1;
        }

        diff[k] = d;
        i--;
        j--;
        k--;
      }

      int idx = 0;
      while (idx < diff.length) {
        if (diff[idx] == 0) idx++;
        else break;
      }

      while (idx < diff.length) System.out.print(diff[idx++] + " ");
    }
  }

  public static void main(String[] args) {
    int[] a1 = { 9, 9, 9 };
    int[] a2 = { 1, 0, 0, 0 };
    Solution foo = new Solution();

    foo.solution(a1, a2); 
  }
}
