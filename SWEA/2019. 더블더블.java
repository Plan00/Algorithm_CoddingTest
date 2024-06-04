import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            int T, result;
            T = sc.nextInt();
            result = 1;

            for(int test_case = 0; test_case <= T; test_case++)
            {
                System.out.printf(result + " ");
                result *= 2;
            }

            sc.close();
	}
    
}
