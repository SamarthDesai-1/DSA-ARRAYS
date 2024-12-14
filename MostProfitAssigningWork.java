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

  /**
   * This function takes in an array of job difficulties, an array of profits of
   * those jobs, and an array of worker abilities.
   * It returns the maximum possible profit that can be made by assigning jobs to
   * workers such that each worker is assigned a job with difficulty less than or
   * equal to their ability.
   * The approach is to first sort the jobs by difficulty and then the workers by
   * ability. Then, for each worker, iterate through the jobs that they can do and
   * add the profit to a max heap.
   * At each step, if the heap is not empty, the maximum profit is the top of the
   * heap. Finally, return the maximum profit.
   * 
   * @param difficulty The array of job difficulties
   * @param profit     The array of profits of the jobs
   * @param worker     The array of worker abilities
   * @return The maximum possible profit
   */
  
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
