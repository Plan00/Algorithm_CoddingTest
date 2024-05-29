import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
            Scanner sc = new Scanner(System.in);

            for(int test_case = 1; test_case <= 10; test_case++)
            {
                sc.nextLine();
                String str = sc.nextLine();
                String numS = "", timesS = "";
                int index = 0;

                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) != ' ') {
                        numS += str.charAt(i);
                        continue;
                    } 
                    index = i;
                    break;
                }

                for(int i = index; i < str.length(); i++) {
                    if(str.charAt(i) != ' ') {
                        timesS += str.charAt(i);
                    } 
                }

                int num = Integer.parseInt(numS);
                int times = Integer.parseInt(timesS);
                int result = squ(num, times);
                System.out.println("#"+ test_case + " " + result);
            }
	}
    
    public static int squ(int num, int times) {
        if(times == 0) {
            return 1;
        }
        return num * squ(num, times - 1);
    }
}
