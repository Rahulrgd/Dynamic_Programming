package CodeWithBabbar;

public class L107_CutIntoSegments3 {

  public static void main(String[] args) {
    int[] cuts = { 1, 1, 4 };
    int length = 4;
    int[] dp = new int[length + 1];
    int ans = solve(cuts, length, dp);
    System.out.println(ans);
  }

  private static int solve(int[] cuts, int length, int[] dp) {
    if(length<0) return Integer.MIN_VALUE;
    if(length==0) return 0;
    int maxCut = Integer.MIN_VALUE;
    for(int cut : cuts){
      int result = solve(cuts, length-cut, dp);
      if(result!=Integer.MIN_VALUE){
        maxCut = Math.max(maxCut, 1+ result);
      }
    }
    dp[length] = maxCut;
    return dp[length];
  }
}
