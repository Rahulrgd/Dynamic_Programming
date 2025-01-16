package CodeWithBabbar;

public class MinCostStairs3 {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 1 };
    int ans = find(arr);
    System.out.println(ans);
  }

  private static int find(int[] arr) {
    int n = arr.length;
    if(n==2) return Math.min(arr[0], arr[1]);
    for(int i=2; i<n; i++){
      arr[i]=Math.min(arr[i]+ arr[i-1], arr[i]+ arr[i-2]);
    }
    return Math.min(arr[n-1], arr[n-2]);
  }
}
