import java.util.*;
import java.io.FileInputStream;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int dump = sc.nextInt();	// 덤프 수
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            // 최소값 ++ 최대값 --
            for (int i = 0; i < dump; i++) {
                arr[0]++;
                arr[99]--;
                Arrays.sort(arr);
            }
            System.out.println("#" + test_case + " " + (arr[99] - arr[0]));
        }
    }
}
