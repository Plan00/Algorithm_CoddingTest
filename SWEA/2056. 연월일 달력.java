import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        int[] ilz = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        T = Integer.parseInt(sc.nextLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String a = sc.nextLine();
            String nyeon = a.substring(0, 4);
            String wol = a.substring(4, 6);
            String ill = a.substring(6, 8);

            if(Integer.parseInt(wol) >= 1 && Integer.parseInt(wol) <= 12 && Integer.parseInt(ill) >= 1 && Integer.parseInt(ill) <= ilz[Integer.parseInt(wol)-1]) { 
                System.out.println("#" + test_case + " " + nyeon + "/" + wol + "/" + ill);
            }
            else {
                System.out.println("#"+ test_case +" -1");
            }
        }
    }
}
