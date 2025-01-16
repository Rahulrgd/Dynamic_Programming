package CodeWithBabbar;

public class NStairs4 {

  public static void main(String[] args) {
    int n=45;
    int ans = steps(n);
    System.out.println(ans);
  }

  private static int steps(int stairs) {
    if(stairs==1 || stairs==2 || stairs==3) return stairs;
    int prev1=1;
    int prev2=2;
    int res=3;
    for(int i=3; i<=stairs; i++){
      res=prev1+prev2;
      prev1=prev2;
      prev2=res;
    }
    return res;
  }
}
