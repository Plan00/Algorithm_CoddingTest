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
            int p1, p2;
            int[] values = new int[5];

            for(int test_case = 1; test_case <= T; test_case++)
            {
                String[] inputs = sc.nextLine().split(" ");
                for(int i = 0; i < inputs.length; i++) {
                    values[i] = Integer.parseInt(inputs[i]);
                }

                p1 = values[0] * values[4];
                if(values[4] > values[2]) {
                    p2 = values[1] + (values[3] * (values[4] - values[2]));
                } else {
                    p2 = values[1];
                }

                if(p1 > p2) System.out.println("#" + test_case + " " + p2);
                else System.out.println("#" + test_case + " " + p1);
            }
	}
}
