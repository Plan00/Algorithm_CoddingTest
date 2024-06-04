import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                int N = sc.nextInt();
                int M = sc.nextInt();
                int K = sc.nextInt();

                int[] sonnim = new int[N];
                for (int i = 0; i < N; i++) {
                    sonnim[i] = sc.nextInt();
                }

                Arrays.sort(sonnim);

                boolean possible = true;
                for (int i = 0; i < N; i++) {
                    if ((sonnim[i] / M) * K < i + 1) {
                        possible = false;
                        break;
                    }
                }

                System.out.println("#" + test_case + " " + (possible ? "Possible" : "Impossible"));
            }

        sc.close();
    }
}
