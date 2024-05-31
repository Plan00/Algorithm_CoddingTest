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
                int N = Integer.parseInt(br.readLine());
                String[] nums = br.readLine().split(" ");
                int sum = 0;
                int count = 0;
                int countAvg = 0;
                int avg;

                for(int i = 0; i < nums.length; i++) {
                    sum += Integer.parseInt(nums[i]);
                    count++;
                }

                avg = sum / count;

                for(int i = 0; i < nums.length; i++) {
                    if(Integer.parseInt(nums[i]) <= avg) {
                        countAvg++;
                    }
                }

                bw.write("#" + test_case + " " + countAvg);
                bw.flush();
                bw.newLine();
            }
            bw.close();
	}
}
