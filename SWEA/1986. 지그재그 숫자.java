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

            for(int   test_case  = 1; test_case <= T; test_case++)
            {
                int no = sc.nextInt();
                int sum = 0;
                for(int i = 0; i <= no; i++) {
                    if(i % 2 == 0) sum -= i;
                    else sum += i;
                }

                System.out.println("#" + test_case + " " +sum);
            }
	}
}
