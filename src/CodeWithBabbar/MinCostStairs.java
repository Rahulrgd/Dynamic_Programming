package CodeWithBabbar;

public class MinCostStairs {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1 };
    int ans = Math.min(find(arr, 0), find(arr, 1));
    System.out.println(ans);
  }

  private static int find(int[] arr, int idx) {
    int n = arr.length;
    if (idx >= n) return 0;
    int a = arr[idx] + find(arr, idx + 1);
    int b = arr[idx] + find(arr, idx + 2);
    return Math.min(a, b);
  }
}
