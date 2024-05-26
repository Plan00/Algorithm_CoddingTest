import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] strs = new String[8];

            for (int i = 0; i < 8; i++) {
                strs[i] = sc.nextLine();
            }

            int count = 0;

            // 가로 회문 검사
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - n; j++) {
                    boolean isPal = true;
                    for (int k = 0; k < n / 2; k++) {
                        if (strs[i].charAt(j + k) != strs[i].charAt(j + n - k - 1)) {
                            isPal = false;
                            break;
                        }
                    }
                    if (isPal) count++;
                }
            }

            // 세로 회문 검사
            for (int col = 0; col < 8; col++) {
                for (int row = 0; row <= 8 - n; row++) {
                    boolean isPal = true;
                    for (int k = 0; k < n / 2; k++) {
                        if (strs[row + k].charAt(col) != strs[row + n - k - 1].charAt(col)) {
                            isPal = false;
                            break;
                        }
                    }
                    if (isPal) count++;
                }
            }

            System.out.println("#" + test_case + " " + count);
        }
    }
}
