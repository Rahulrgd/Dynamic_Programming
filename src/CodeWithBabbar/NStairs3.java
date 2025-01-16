package CodeWithBabbar;

public class NStairs3 {

  public static void main(String[] args) {
    int n=45;
    int ans = steps(n);
    System.out.println(ans);
  }

  private static int steps(int stairs) {
    int[] arr = new int[stairs+1];
    if(stairs==1 || stairs==2 || stairs==3) return stairs;
    arr[0]=0;
    arr[1]=1;
    arr[2]=2;
    for(int i=3; i<=stairs; i++){
      arr[i]=arr[i-1] + arr[i-2];
    }
    return arr[stairs];
  }
}
