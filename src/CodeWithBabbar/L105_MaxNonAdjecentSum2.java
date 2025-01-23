package CodeWithBabbar;

public class L105_MaxNonAdjecentSum2 {

  public static void main(String[] args) {
    int[] arr = { 9, 3, 9, 11 };
    int ans = solve(arr, 0);
    System.out.println(ans);
  }

  private static int solve(int[] arr, int idx) {
    if(idx>=arr.length) return 0;
    int include = arr[idx] + solve(arr, idx+2);
    int exclude = solve(arr, idx+1);

    // return Math.max(include, exclude);
    int result = Math.max(include, exclude);
    return result;
  }
}
