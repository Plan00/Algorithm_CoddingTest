import java.util.*;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            String[] ns = sc.nextLine().split(" ");
            HashSet<Integer> set = new HashSet<>();
            StringBuilder result = new StringBuilder();

            for(int i = 1; i <= Integer.parseInt(ns[0]); i++) {
                set.add(i);
            }

            String[] submit = sc.nextLine().split(" ");
            for(String s : submit) {
                set.remove(Integer.parseInt(s));
            }

            result.append("#").append(test_case).append(" ");
            for(int num : set) {
                result.append(num).append(" ");
            }

            System.out.println(result.toString().trim());
        }
    }
}
