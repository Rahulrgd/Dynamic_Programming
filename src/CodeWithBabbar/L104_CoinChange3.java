package CodeWithBabbar;

import java.util.ArrayList;
import java.util.List;

public class L104_CoinChange3 {

  public static void main(String[] args) {
    int[] coins = { 1, 2, 5 };
    int amount = 111;
    int ans = solve(coins, amount);
    System.out.println("Real answer: " + ans);
  }

  private static int solve(int[] coins, int amount) {
    if (amount < 0) return 0;
    int[] minCoins = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
      minCoins[i] = Integer.MAX_VALUE;
      for (int coin : coins) {
        if (coin <= i && minCoins[i - coin] != Integer.MAX_VALUE) {
          minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coin]);
        }
      }
    }
    if (minCoins[amount] == Integer.MAX_VALUE) return -1;
    return minCoins[amount];
  }
}
