import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            sc.nextLine();
            String[] cards = sc.nextLine().split(" ");

            int half = (N % 2 == 0) ? N / 2 : N / 2 + 1;

            System.out.printf("#%d ", test_case);

            for (int i = 0; i < half; i++) {
                System.out.printf(cards[i] + " ");
                if (half + i < N)
                    System.out.printf(cards[half + i] + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
