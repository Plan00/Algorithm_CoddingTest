import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++)
        {
            String str = sc.nextLine();
            String result = removeW(str);
            System.out.println("#" + test_case + " " + result);
        }
    }

    private static String removeW(String str)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}
