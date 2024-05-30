import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Solution
{
	public static void main(String args[]) throws IOException
	{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String T = br.readLine();

            for(int test_case = 1; test_case <= Integer.parseInt(T); test_case++)
            {
                int N = Integer.parseInt(br.readLine());
                int result = N / 3;

                bw.write("#" + test_case + " " + result + "\n");
                bw.flush();
            }

            bw.close();
	}
}
