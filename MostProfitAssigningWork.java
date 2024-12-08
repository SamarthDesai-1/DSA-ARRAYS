import java.util.*;

public class MostProfitAssigningWork {

  public static class Job {
    int difficulty;
    int profit;

    Job(int difficulty, int profit) {
      this.difficulty = difficulty;
      this.profit = profit;
    }
  }

  public static int maxProfit(int[] difficulty, int[] profit, int[] worker) {
    Arrays.sort(worker);

    int n = difficulty.length;
    Job jobs[] = new Job[n];

    for (int i = 0; i < n; i++) 
      jobs[i] = new Job(difficulty[i], profit[i]);

    Arrays.sort(jobs, new Comparator<Job>() {
      public int compare(Job jOne, Job jTwo) {
        return jOne.difficulty - jTwo.difficulty;
      }
    });

    int i = 0;
    int maxProfit = 0;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for (int j = 0; j < worker.length; j++) {

      while (i < n && jobs[i].difficulty <= worker[j]) {
        maxHeap.add(jobs[i].profit);
        i++;
      }

      if (!maxHeap.isEmpty())
        maxProfit += maxHeap.peek(); 
    }

    return maxProfit;
  }

  public static void main(String[] args) {
    int[] difficulty = { 22, 42, 87, 65, 93 };
    int[] profit = { 500, 600, 1000, 50, 200 };
    int[] worker = { 43, 87 };

    System.out.println("Max profit : " + maxProfit(difficulty, profit, worker));
  }
}
