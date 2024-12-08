public class RemoveDuplicatesFromSortedArrayTwo {

  public static int removeDuplicates(int[] nums) {

    final int maintainTwo = 2;
    int back = 0;
    int front = 0;
    int pointer = 0;
    int count = 0;

    while (front < nums.length) {

      int target = nums[back];

      while (front < nums.length && nums[front] == target) {
        front++;
      }

      if (front - back >= maintainTwo) {
        count++;
        nums[pointer++] = nums[back++];
        count++;
        nums[pointer++] = nums[back];
      }
      else {
        count++;
        nums[pointer++] = nums[back];
      }

      back = front;
    }

    
    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10 };
    
    int count = removeDuplicates(nums);

    System.out.println("Value of K : " + count);
    
    for (int i = 0; i < count; i++) 
      System.out.print(nums[i] + " ");
  }
}
