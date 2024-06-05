import java.util.Scanner;

public class Solution {
    static int N, L;
    static int[] score;
    static int[] cal;

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int tc = 1; tc <= T; tc++) {
                N = sc.nextInt();
                L = sc.nextInt();
                score = new int[N];
                cal = new int[N];

                for (int i = 0; i < N; i++) {
                    score[i] = sc.nextInt();
                    cal[i] = sc.nextInt();
                }

                int maxScore = hamburger();

                System.out.println("#" + tc + " " + maxScore);
            }
            sc.close();
    }

    private static int hamburger() {
            int[] dp = new int[L + 1];

            for (int i = 0; i < N; i++) {
                for (int j = L; j >= cal[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - cal[i]] + score[i]);
                }
            }

            int maxScore = 0;
            for (int i = 0; i <= L; i++) {
                maxScore = Math.max(maxScore, dp[i]);
            }

            return maxScore;
    }
}
