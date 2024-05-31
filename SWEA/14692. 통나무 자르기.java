import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();

            System.out.print("#" + test_case + " ");
            if (N % 2 == 0) System.out.println("Alice");
            else System.out.println("Bob");
        }
        scanner.close();
    }
}
