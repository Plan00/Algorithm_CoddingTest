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

            for(int test_case = 1; test_case <= T; test_case++)
            {
                StringBuilder sbOrigin = new StringBuilder(sc.nextLine());
                int count = 0;
                boolean isOne = false;
                int start = (int)sbOrigin.indexOf("1");

                for(int i = start; i < sbOrigin.length(); i++) {
                    if(start == -1) {
                        count = 1;
                        break;
                    }
                    if(isOne == true && sbOrigin.charAt(i) == '0') {
                        isOne = false;
                        count++;
                    } else if(isOne == false && sbOrigin.charAt(i) == '1') {
                        isOne = true;
                        count++;
                    }
                }

                System.out.println("#" + test_case + " " + count);
            }
	}
}
