public class SumOfArrays {

  public static void solution(int[] nums1, int[] nums2) {
    int[] sum = new int[Math.max(nums1.length, nums2.length)];
    int carry = 0;
    
    int i = nums1.length - 1;
    int j = nums2.length - 1;
    int k = sum.length - 1;

    while (k >= 0) {
      int digit = carry;
      if (i >= 0) digit += nums1[i]; 
      if (j >= 0) digit += nums2[j];
      carry = digit / 10;
      digit %= 10;

      sum[k] = digit;
      i--;
      j--;
      k--;
    }
    System.out.print("Sum : ");
    if (carry != 0) System.out.print(carry);
    for (int x : sum) System.out.print(x);
  }

  public static void main(String[] args) {
    int[] nums1 = { 9, 7, 0, 1, 5 };
    int[] nums2 = { 4, 5, 5, 2, 8, 1, 6 };
    solution(nums1, nums2);
  }
}
