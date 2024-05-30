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
                String[] strs = br.readLine().split(" ");
                int t1 = Integer.parseInt(strs[0]);
                int t2 = Integer.parseInt(strs[1]);
                int t3;

                if((t1 + t2) >= 24) t3 = t1 + t2 - 24;
                else t3 = t1 + t2;

                bw.write("#" + test_case + " " + t3 + "\n");
                bw.flush();
            }
            bw.close();
	}
}
