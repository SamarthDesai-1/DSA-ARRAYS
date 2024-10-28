public class SingleElementSortedArray {

  public static int singleElement(int[] nums) {

    if (nums.length == 1) return nums[0];

    int front = 0;
    int back = 0;

    while (front < nums.length) {

      int compareVal = nums[back];

      while (front < nums.length && nums[front] == compareVal) {
        front++;
      }

      int distance = front == nums.length - 1 ? front - back : front - 1 - back;

      if (distance == 0)
        return nums[back];

      back = front;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 8, 8 };

    System.out.println("Single element is : [ " + singleElement(nums) + " ]");
  }
}
