import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        	int a, b;


		for(int test_case = 1; test_case <= T; test_case++)
		{
                    a = sc.nextInt();
                    b = sc.nextInt();

                    if(a>b) {
                        System.out.println("#"+test_case+" >");
                    } else if(a==b) {
                        System.out.println("#"+test_case+" =");
                    } else if(a<b) {
                        System.out.println("#"+test_case+" <");
                    }

		}
	}
}
