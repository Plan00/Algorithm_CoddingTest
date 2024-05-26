import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        int[][] arr = new int[100][100];
        T=sc.nextInt();

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            sc.nextLine();
            int max = 0;

            // 입력
            for (int i = 0; i < 100; i++) {
                String[] str = sc.nextLine().split(" ");
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }

            // 최대값
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < 100; i++) {
                int rowSum = 0, colSum = 0;
                for (int j = 0; j < 100; j++) {
                    rowSum += arr[i][j];
                    colSum += arr[j][i];
                }
                max = Math.max(max, Math.max(rowSum, colSum));
                sum1 += arr[i][i];
                sum2 += arr[i][99 - i];
            }
            max = Math.max(max, Math.max(sum1, sum2));

            System.out.println("#" + test_case + " " + max);
        }
    }
}
