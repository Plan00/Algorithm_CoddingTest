import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
		for (int test_case = 1; test_case <= T; test_case++) {
            String tc = Integer.toString(test_case);
            StringBuilder sb = new StringBuilder();
            int count = 0; 
             
            for (int i = 0; i < tc.length(); i++) {
                if (tc.charAt(i) == '3' || tc.charAt(i) == '6' || 
                		tc.charAt(i) == '9') {
                    count++;
                }
            }
             
            if (count > 0) { 
                for (int i = 0; i < count; i++) {
                    sb.append("-");
                }
            } else {
                sb.append(tc);
            }
             
            sb.append(" "); 
            System.out.print(sb.toString());
        }
    }
}
