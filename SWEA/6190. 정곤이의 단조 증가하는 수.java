import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            
            for(int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            
            int max = -1;
            
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    int product = nums[i] * nums[j];
                    String str = String.valueOf(product);
                    boolean increase = true;
                    
                    for(int k = 1; k < str.length(); k++) {
                        if(str.charAt(k - 1) > str.charAt(k)) {
                            increase = false;
                            break;
                        }
                    }
                    
                    if(increase) {
                        max = Math.max(max, product);
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + max);
        }
        
        sc.close();
    }
}
