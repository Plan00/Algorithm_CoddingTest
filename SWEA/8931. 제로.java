import java.util.Scanner;
import java.util.Stack; 
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
                int K = sc.nextInt();
                int sum = 0;
                Stack<Integer> stack = new Stack<>();

                for(int i = 0; i < K; i++) {
                    int num = sc.nextInt();
                    if(num == 0) stack.pop();
                    else stack.push(num);
                }

                for(int i = 0; i < K; i++) {
                    if(stack.isEmpty()) break;
                    else sum += stack.pop();
                }

                System.out.println("#" + test_case + " " + sum);
            }
	}
}
