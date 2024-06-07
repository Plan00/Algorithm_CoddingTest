import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int test_case = 1; test_case <= T; test_case++) {
            String cup = sc.next();
            int count = sc.nextInt();
            int bub;
            
            if (cup.charAt(0) == 'o') {
                bub = 0;
            } else if (cup.charAt(1) == 'o') {
                bub = 1;
            } else {
                bub = 2;
            }
            
            while (count > 0) {
                switch (bub) {
                    case 0:
                        bub = 1;
                        break;
                    case 1:
                        bub = 0;
                        break;
                    case 2:
                        bub = 1;
                        break;
                }
                count--;
            }

            System.out.println("#" + test_case + " " + bub);
        }
        
        sc.close();
    }
}
