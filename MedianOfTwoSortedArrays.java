import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

  public static double solution(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();
    for (int x : nums1) list.add(x);
    for (int x : nums2) list.add(x);
  
    list.sort(null);
    
    if (list.size() % 2 == 1) return (double) list.get(list.size() / 2);
  
    int adj2 = list.size() / 2;
    int adj1 = adj2 - 1;
    return (double) (list.get(adj1) + list.get(adj2)) / 2;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 3 };
    int[] nums2 = { 2,4 };

    double ans = solution(nums1, nums2);
    System.out.println(ans);
  }
}
