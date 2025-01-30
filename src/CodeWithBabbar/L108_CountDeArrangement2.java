package CodeWithBabbar;

public class L108_CountDeArrangement2 {

  public static void main(String[] args) {
    int n = 4;
    int ans = solve(n);
    System.out.println(ans);
  }

  private static int solve(int n) {
    if(n==1) return 0;
    if(n==2) return 1;

    int prev1 = 0;
    int prev2 = 1;

    int current = 0;

    for(int i=3; i<=n; i++){
        current = (i-1) * (prev1 + prev2);
        prev1 = prev2;
        prev2 = current;
    }

    return current;
  }
}
