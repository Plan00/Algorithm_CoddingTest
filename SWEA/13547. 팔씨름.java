import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();
            sc.nextLine();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int count = 0;
                String str = sc.nextLine();

                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == 'x') count++;
                }

                if(count >= 8) System.out.println("#" + test_case + " NO");
                else System.out.println("#" + test_case + " YES");
            }
	}
}
