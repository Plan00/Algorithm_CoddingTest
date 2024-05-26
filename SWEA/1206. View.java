import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int testCase = 1; testCase <= 10; testCase++) {
            int count = sc.nextInt();
            int[] hei = new int[count];
            int tot = 0;

            // 입력
            for (int i = 0; i < count; i++) {
                hei[i] = sc.nextInt();
            }

            // 첫 두 건물과 마지막 두 건물은 비교할 건물이 X
            for (int i = 2; i < count - 2; i++) {
                int max = Math.max(hei[i - 2], hei[i - 1]);
                max = Math.max(max, hei[i + 1]);
                max = Math.max(max, hei[i + 2]);
                
                // 현재 건물이 좌우 두 건물보다 높으면 그만큼 +
                if (max < hei[i]) {
                    tot += (hei[i] - max);
                }
            }

            System.out.println("#" + testCase + " " + tot);
        }
    }
}
