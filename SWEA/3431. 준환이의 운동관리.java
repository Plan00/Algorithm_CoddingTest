import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();
            sc.nextLine();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                String[] strs = sc.nextLine().split(" ");
                int L = Integer.parseInt(strs[0]);
                int U = Integer.parseInt(strs[1]);
                int X = Integer.parseInt(strs[2]);

                if(L <= X && X <= U) System.out.println("#" + test_case + " " + 0);
                else if(X < L) System.out.println("#" + test_case + " " + (L-X));
                else System.out.println("#" + test_case + " " + "-1");
            }
	}
}
