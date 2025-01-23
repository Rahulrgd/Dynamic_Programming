package CodeWithBabbar;

public class L105_MaxNonAdjecentSum3 {

  public static void main(String[] args) {
    int[] arr = { 9, 3, 9, 11 };
    int ans = solve(arr);
    System.out.println(ans);
  }

  private static int solve(int[] arr) {
    int n = arr.length;
    if(n==0) return 0;
    if(n==1) return arr[0];
    int prev2 = 0;
    int prev1 = arr[0];
    for(int i=1; i<n; i++){
      int current = Math.max(prev1, arr[i]+prev2);
      prev2=prev1;
      prev1=current;
    }
    return prev1;
  }
}
