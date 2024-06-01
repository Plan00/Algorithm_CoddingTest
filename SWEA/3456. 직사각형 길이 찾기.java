import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();
            sc.nextLine();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int[] nums = new int[3];

                for(int i = 0; i < nums.length; i++) {
                    nums[i] = sc.nextInt();
                }

                if(nums[0] == nums[1]) {
                    System.out.println("#" + test_case + " " + nums[2]);
                } else if(nums[0] == nums[2]) {
                    System.out.println("#" + test_case + " " + nums[1]);
                } else {
                    System.out.println("#" + test_case + " " + nums[0]);
                }

            }
	}
}
