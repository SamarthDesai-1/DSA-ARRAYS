public class FindTheDistanceBetweenTwoArrays {

  public static int findDistance(int[] arr1, int[] arr2, int d) {

    boolean result = false;
    int Ans = arr1.length;

    for (int i = 0; i < arr1.length; i++) {

      for (int j = 0; j < arr2.length; j++) {
        int diff = Math.abs(arr1[i] - arr2[j]);

        if (diff <= d) {
          result = !result;
          break;
        }
      }

      if (result == true) {
        Ans = Ans - 1;
        result = false;
      }
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] nums1 = { 4, 5, 8 };
    int[] nums2 = { 10, 9, 1, 8 };
    int d = 2;
    
    System.out.println("Distance between two arrays is: " + findDistance(nums1, nums2, d));
  }
}
