package CodeWithBabbar;

public class Fibonacci2 {

  public static void main(String[] args) {
    int ans = fibo(6);
    System.out.println(ans);
  }

  private static int fibo(int n) {
    if(n<=1) return n;
    int[] arr = new int[n+1];
    arr[0]=1;
    arr[1]=1;
    for(int i=2; i<=n; i++){
        arr[i]=fibo(n-1) + fibo(n-2);
    }
    return arr[n];
  }
}
