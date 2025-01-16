package CodeWithBabbar;

public class MinCostStairs2 {

  public static void main(String[] args) {
    int[] arr = { 1, 100, 1, 1 };
    int n = arr.length;
    int[] res = new int[n];
    for(int i=0; i<n; i++){
      res[i]=-1;
    }
    int ans = Math.min(find(arr, res, 0), find(arr, res, 1));
    System.out.println(ans);
  }

  private static int find(int[] arr, int[] res, int idx) {
    if(idx>=arr.length) return 0;
    if(res[idx]!=-1) return res[idx];
    int a = arr[idx]+find(arr, res, idx+1);
    int b =arr[idx]+find(arr, res, idx+2);
    res[idx] = Math.min(a,b);
    return res[idx];
  }
}
