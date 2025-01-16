package CodeWithBabbar;

public class NStairs2 {

  public static void main(String[] args) {
    int n=45;
    int[] arr = new int[n+1];
    for(int i=0; i<=n; i++){
        arr[i]=-1;
    }
    int ans = steps(n, arr);
    System.out.println(ans);
  }

  private static int steps(int stairs, int[] arr) {
    if(stairs==0) return 1;
    if(stairs<0) return 0;
    if(arr[stairs]!=-1) return arr[stairs];
    arr[stairs]=steps(stairs-1, arr) + steps(stairs-2, arr);
    return arr[stairs];
  }
}
