import java.util.*;

public class FindTheDistanceBetweenTwoArraysBinarySearch {

  public static boolean binarySearch(int target,int[] nums2, int d) {

    int start = 0;
    int end = nums2.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (Math.abs(nums2[mid] - target) <= d) return false;
      else if (nums2[mid] < target - d) start = mid + 1;
      else end = mid - 1; 
    }

    return true;
  }

  public static int findDistance(int[] nums1, int[] nums2, int d) {
    Arrays.sort(nums2);

    int Ans = 0;

    for (int num : nums1) {
      if (binarySearch(num, nums2, d)) Ans++;
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 1, 100, 3 };
    int[] arr2 = { -5, -2, 10, -3, 7 };
    int d = 6;

    System.out.println("Distance between two arrays is: " + findDistance(arr1, arr2, d));
  }
}
