import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            sc.nextLine();

            for(int test_case = 1; test_case <= T; test_case++) {
                char[] s = sc.nextLine().toCharArray();
                int[] check = new int['z'+1];
                StringBuilder result = new StringBuilder();
                for(int i = 0; i < s.length; i++) {
                    check[s[i]]++;
                }
                for(int i = 'a'; i <= 'z'; i++) {
                    if(check[i] % 2 != 0)
                        result.append(Character.toString((char)i));    
                }
                if(result.length() == 0)
                    System.out.println("#" + test_case + " Good");
                else
                    System.out.println("#" + test_case + " " + result);
            }
            sc.close();
    }
}
