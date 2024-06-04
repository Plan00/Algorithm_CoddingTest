import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);
            String[] str = sc.nextLine().split(" ");

            if(Integer.parseInt(str[0]) == 1 && Integer.parseInt(str[1]) == 3 || Integer.parseInt(str[0]) == 3 && Integer.parseInt(str[1]) == 2) {
                System.out.println("A");
            }else if(Integer.parseInt(str[0]) == 1 && Integer.parseInt(str[1]) == 2 || Integer.parseInt(str[0]) == 2 && Integer.parseInt(str[1]) == 3) {
                System.out.println("B");
            }

            sc.close();
	}
    
}
