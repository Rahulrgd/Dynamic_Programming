package CodeWithBabbar;

public class L107_CutIntoSegments {

  public static void main(String[] args) {
    int[] cuts = { 7, 9, 10 };
    int l = 7;
    int ans = solve(cuts, l, 0, 0);
    System.out.println(ans);
  }

  private static int solve(int[] cuts, int l, int idx, int totalCuts) {
    if (l < 0) return 0;
    if (l == 0) return totalCuts;
    if (idx >= cuts.length) return 0;
    int include = solve(cuts, l - cuts[idx], idx, totalCuts + 1);
    int exclude = solve(cuts, l, idx + 1, totalCuts);

    return Math.max(include, exclude);
  }
}
