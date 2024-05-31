import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = Integer.parseInt(br.readLine());

            for(int test_case = 1; test_case <= T; test_case++) {
                int N = Integer.parseInt(br.readLine());
                String str = br.readLine();
                String strC = br.readLine();
                int cnt = 0;

                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == strC.charAt(i))
                        cnt++;
                }

                bw.write("#" + test_case + " " + cnt + "\n");
            }

            bw.flush();
            bw.close();
            br.close();
    }
}
