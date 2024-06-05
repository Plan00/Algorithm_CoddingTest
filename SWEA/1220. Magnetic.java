import java.util.Scanner;

class Solution {
    public static int[][] table = new int[100][100];

    public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);

            for (int test_case = 1; test_case <= 10; test_case++) {
                int size = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < size; i++) {
                    String[] str = sc.nextLine().split(" ");
                    for (int j = 0; j < size; j++) {
                        table[i][j] = Integer.parseInt(str[j]);
                    }
                }

                int count = 0;

                for (int j = 0; j < size; j++) {
                    boolean inDeadlock = false;  // 교착 상태 여부
                    for (int i = 0; i < size; i++) {
                        if (table[i][j] == 1) {
                            // N
                            inDeadlock = true;
                        } else if (table[i][j] == 2) {
                            // S
                            if (inDeadlock) {
                                // 교착 상태
                                count++;
                                inDeadlock = false;  // 초기화
                            }
                        }
                    }
                }

                System.out.println("#" + test_case + " " + count);
            }

        sc.close();
    }
}
