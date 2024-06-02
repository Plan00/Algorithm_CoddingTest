import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int N = sc.nextInt();
                int D = sc.nextInt();
                int count = 0;

                while(N > D) {
                    N -= D * 2 + 1;
                    count++;
                }

                if(N > 0) count++;

                System.out.println("#" + test_case + " " + count);
            }

            sc.close();
	}
}
