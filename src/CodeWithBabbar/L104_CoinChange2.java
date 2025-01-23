package CodeWithBabbar;

import java.util.Arrays;

public class L104_CoinChange2 {

  public static void main(String[] args) {
    int[] coins = { 1, 2, 5 };
    int amount = 111;
    int count = 0;
    int idx = 0;
    int[][] dp = new int[coins.length + 1][amount + 1];
    for(int[] arr: dp){
      Arrays.fill(arr, -1);
    }
    int ans = solve(coins, amount, idx, count, dp);
    System.out.println(ans==Integer.MAX_VALUE?-1:ans);
  }

  private static int solve(
    int[] coins,
    int amount,
    int idx,
    int count,
    int[][] dp
  ) {
    if(amount==0) return 0;
    if(amount<0 || idx==coins.length) return Integer.MAX_VALUE;
    if(dp[idx][amount]!=-1) return dp[idx][amount];

    int include = solve(coins, amount-coins[idx], idx, count+1, dp);
    if (include != Integer.MAX_VALUE) include += 1;
    int exclude = solve(coins, amount, idx+1, count, dp);
    dp[idx][amount] = Math.min(include, exclude);

    return dp[idx][amount];
  }
}
