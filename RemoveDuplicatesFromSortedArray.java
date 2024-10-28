public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {

    int[] nums = { -1, 0, 0, 0, 1, 1, 2, 2, 4, 4, 4, 4, 4, 5, 5, 6 };

    int front = 0;
    int back = 0;
    int count = 0;
    int x = 0;

    while (front < nums.length) {
      
      int target = nums[back];

      while (front < nums.length && nums[front] == target) {
        front++;
      }

      count++;
      nums[x++] = nums[back];
      back = front;
    }

    System.out.println("Value of K : " + count);
    
    for (int i = 0; i < count; i++) 
      System.out.print(nums[i] + " ");
  }
}
