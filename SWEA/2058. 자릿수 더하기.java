import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int T, sum=0, a;
        T=sc.nextInt();

        for(int i=0; i<4; i++) {
            a = T % 10;
            T /= 10;
            sum += a;
        }
        System.out.println(sum);
	}
}
