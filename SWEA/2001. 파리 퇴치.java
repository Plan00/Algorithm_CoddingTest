import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            String[] str = sc.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                str = sc.nextLine().split(" ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }

            int max = 0;
            for (int i = 0; i <= n - m; i++) {
                for (int j = 0; j <= n - m; j++) {
                    int sum = 0;
                    for (int k = i; k < i + m; k++) {
                        for (int l = j; l < j + m; l++) {
                            sum += arr[k][l];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
            
            System.out.println("#" + test_case + " " + max);
        }
        sc.close();
    }
}
