import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);

            for (int test_case = 1; test_case <= 10; test_case++) {
                sc.nextLine();
                int count = 0;
                String obj = sc.nextLine();
                String str = sc.nextLine();

                // obj 카운트
                for (int i = 0; i <= str.length() - obj.length(); i++) {
                    boolean found = true;
                    for (int j = 0; j < obj.length(); j++) {
                        if (obj.charAt(j) != str.charAt(i + j)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        count++;
                    }
                }
                System.out.println("#" + test_case + " " + count);
            }
    }
}
