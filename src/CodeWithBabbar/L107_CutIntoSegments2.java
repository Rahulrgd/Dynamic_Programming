package CodeWithBabbar;

public class L107_CutIntoSegments2 {

  public static void main(String[] args) {
    int[] cuts = { 1, 1, 4 };
    int length = 4;
    int[] dp = new int[length+1];
    int ans = solve(cuts, length, 0, 0, dp);
    System.out.println(ans);
  }

  private static int solve(int[] cuts, int length, int idx, int totalCuts, int[] dp) {
    if(dp[idx] != 0) return dp[idx];
    if(length<0) return 0;
    if(length==0) return totalCuts;
    if(idx>= cuts.length) return 0;
    dp[idx] = solve(cuts, length-cuts[idx], idx, totalCuts+1, dp);
    int exclude = solve(cuts, length, idx+1, totalCuts, dp);
    return Math.max(dp[length], exclude);
  }
}
