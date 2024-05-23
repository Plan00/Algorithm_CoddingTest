import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            String T;
            char b = 'A';
            int a, c = (int)b;
            T=sc.nextLine();

            for(int test_case = 0; test_case < T.length(); test_case++)
            {
                a = (int)T.charAt(test_case) - (int)b + 1;
                System.out.printf(a+" ");
            }
	}
}
