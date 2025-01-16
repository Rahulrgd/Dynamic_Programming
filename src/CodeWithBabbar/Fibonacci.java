package CodeWithBabbar;

public class Fibonacci {

  public static void main(String[] args) {
      int[] arr = new int[7]; 
      for(int i=0; i<arr.length; i++){
        arr[i]=-1;
      }
    int ans = fibo(6, arr);

    System.out.println(ans);
  }

  private static int fibo(int n, int[] arr) {
    if(n==0 || n==1) return n;
    if(arr[n]!=-1) return arr[n];
    arr[n] = fibo(n-1, arr) + fibo(n-2, arr);
    return arr[n];
  }
}
