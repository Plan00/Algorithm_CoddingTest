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
                bw.write("#" + test_case + " ");
                for(int i = 0; i < N; i++) {
                    bw.write("1/" + N + " ");
                }
                bw.write("\n");
                bw.flush();
            }
            bw.close();
	}
}
