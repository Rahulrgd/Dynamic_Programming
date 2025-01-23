package CodeWithBabbar;

public class L105_MaxNonAdjecentSum1 {

  public static void main(String[] args) {
    int[] arr = { 9, 3, 9, 11 };
    int ans = solve(arr);
    System.out.println(ans);
  }

  private static int solve(int[] arr) {
    int maxSum = 0;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j = j + 2) {
        sum = sum + arr[j];
      }
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }
}
