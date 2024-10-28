public class CountOccurrences {

  public static void main(String[] args) {
    int[] nums = { 2, 4, 4, 4, 5, 6 };
    int count = 0;

    int target = 4;

    for (int i = 0; i < nums.length; i++) 
      if (nums[i] == target)
        count++;

    System.out.println("Occurrences of target [ " + target + " ] is : " + count);
  }

}
