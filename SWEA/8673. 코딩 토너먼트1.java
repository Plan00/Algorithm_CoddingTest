import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();
            for (int test_case = 1; test_case <= T; test_case++) {
                int K = sc.nextInt();
                int sum = 0;
                Queue<Integer> queue = new LinkedList<>();

                for (int i = 0; i < (int) Math.pow(2, K); i++) {
                    queue.add(sc.nextInt());
                }

                while (queue.size() >= 2) {
                    int a = queue.poll();
                    int b = queue.poll();

                    queue.add(Math.max(a, b));
                    sum += Math.abs(a - b);
                }
                System.out.println("#" + test_case + " " + sum);
            }
    }
}
