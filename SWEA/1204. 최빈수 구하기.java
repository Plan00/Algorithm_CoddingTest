import java.util.*;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        sc.nextLine(); 

        for (int test_case = 1; test_case <= T; test_case++) {
            HashMap<Integer, Integer> scrs = new HashMap<>();
            int maxFreq = 0, mostFreqNum = 0;

            sc.nextLine();
            String[] str = sc.nextLine().split(" ");

            for (String s : str) {
                int num = Integer.parseInt(s);
                int count = scrs.getOrDefault(num, 0) + 1;
                scrs.put(num, count);

                if (count > maxFreq) {
                    maxFreq = count;
                    mostFreqNum = num;
                } else if (count == maxFreq) {
                    mostFreqNum = Math.max(mostFreqNum, num);
                }
            }

            System.out.println("#" + test_case + " " + mostFreqNum);
        }
    }
}
