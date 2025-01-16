package CodeWithBabbar;

public class Fibonacci3 {
    public static void main(String[] args) {
        int n=6;
        int prev1=0;
        int prev2=1;
        for(int i=2; i<=n; i++){
            int curr = prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        System.out.println(prev2);
    }
}
