import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Solution
{
	public static void main(String args[]) throws IOException
	{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = Integer.parseInt(br.readLine());

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int result = 1;
                String[] nums = br.readLine().split(" ");

                for(int i = 0; i < nums.length; i++) {
                    if(Integer.parseInt(nums[i]) >= 10) {
                        result = -1;
                        break;
                    }
                    else result *= Integer.parseInt(nums[i]);
                }

                bw.write("#" + test_case + " " + result + "\n");
                bw.flush();
            }
            bw.close();
	}
}
