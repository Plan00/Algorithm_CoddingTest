import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
            	int max, temp;

		for(int test_case = 1; test_case <= T; test_case++)
		{
                    max = sc.nextInt();
                    for(int i = 0; i < 9; i++)
                    {
                        temp = sc.nextInt();
                        if(max<temp) {
                            max = temp;
                        }
                    }
                    System.out.println("#"+ test_case +" "+ max);
		}
	}
}
