package CodeWithBabbar;

public class L108_CountDeArrangement {

  public static void main(String[] args) {
    int n = 4;
    int ans = solve(n);
    System.out.println(ans);
  }

  private static int solve(int n) {
    if(n==1) return 0;
    if(n==2) return 1;
    int[] dp = new int[n+1];
    dp[1]=0;
    dp[2]=1; 
    for(int i=3; i<=n; i++){
        dp[i] = (i-1) * (dp[i-1] + dp[i-2]); 
    }
    return dp[n];
  }
}
