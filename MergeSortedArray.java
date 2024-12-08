public class MergeSortedArray {

  public static int[] filler(int[] nums, int index, int pointer, int[] output, int x) {
    for (int i = pointer; i < x; i++, index++) 
      output[index] = nums[i];

    return output;
  }

  /** This problem is solved using two pointer approach in O(m + n) time. */
  
  public static int[] merge(int[] one, int m, int[] two, int n) {
    int[] output = new int[m + n];
    int left = 0;
    int right = 0;
    int index = 0;

    while (left < m && right < n) {

      if (one[left] < two[right]) 
        output[index] = one[left++];
    
      else if (one[left] > two[right]) 
        output[index] = two[right++];
      
      else {
        output[index++] = one[left++];
        output[index] = two[right++];
      }

      index++;
    }

    return right == two.length ? filler(one, index, left, output, m) : filler(two, index, right, output, n);
  }

  public static void main(String[] args) {
    int[] one = { 1, 2, 5, 7, 8, 9, 63, 96, 0, 0, 0, 0 };
    int m = 8;
    int[] two = { 5, 8, 9, 10 };
    int n = 4;

    System.out.println("Merged array of One and Two.");
    for (int x : merge(one, m, two, n))
      System.out.print(x + " ");
  }
}