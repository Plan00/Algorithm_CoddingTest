import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] lis = new int[T];

		for(int test_case = 1; test_case <= T; test_case++)
		{
			lis[test_case-1] = sc.nextInt();
		}
        
		Arrays.sort(lis);
		System.out.println(lis[T/2]);
	}
}
