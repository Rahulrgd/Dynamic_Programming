package CodeWithBabbar;

import java.util.Arrays;

public class L107_CutIntoSegments6 {

  public static void main(String[] args) {
    int[] cuts = { 1, 1, 4 };
    int length = 4;
    int ans = solve(cuts, length);
    System.out.println(ans);
  }

  private static int solve(int[] cuts, int length) {
    int[] dp = new int[length+1];
    Arrays.fill(dp, Integer.MIN_VALUE);
    dp[0]=0;
    for(int i=1; i<=length; i++){
      for(int cut: cuts){
        if(i-cut>=0 && dp[i-cut]!=Integer.MIN_VALUE){
          dp[i]=Math.max(dp[i], 1 + dp[i-cut]);
        }
      }
    }
    return dp[length]==Integer.MIN_VALUE?0:dp[length];
  }
}
