package CodeWithBabbar;

public class L104_CoinChange1 {

  public static void main(String[] args) {
    int[] coins = { 1, 2, 5 };
    int amount = 111;
    int ans = solve(coins, amount, 0, 0);
    System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
  }

  private static int solve(int[] coins, int amount, int idx, int count) {

    if(amount==0) return count;
    if(amount<0 || idx==coins.length) return Integer.MAX_VALUE;
    

    int include = solve(coins, amount-coins[idx], idx, count+1);
    int exclude = solve(coins, amount, idx+1, count);

    return Math.min(include, exclude);
  }
}
