package CodeWithBabbar;

public class L106_RobberyProblem1 {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    int ans = rob(nums);
    System.out.println(ans);
  }

  private static int rob(int[] nums) {
    int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int prev2 = 0;
        int prev1 = nums[0];
        for(int i=0; i<n; i++){
            int current = Math.max(prev1,nums[i]+prev2 );
            if(i!=n-1) prev2=prev1;
            if(i!=0) prev1=current;
        }
        return prev1;
  }
}
