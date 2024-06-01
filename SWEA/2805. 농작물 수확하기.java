import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case=1; test_case<=T; test_case++) {
            int size = sc.nextInt();
            sc.nextLine();
            
            int[][] square = new int[size][size];
            
            for(int i=0; i<size; i++) {
                String line = sc.nextLine();
                for(int j=0; j<size; j++) {
                    square[i][j] = line.charAt(j) - '0';
                }
            }
            
            int sum = 0;
            int mid = size / 2; 
            
            // 위
            for(int i = 0; i < mid; i++) {
                for(int j = mid - i; j <= mid + i; j++) {
                    sum += square[i][j];
                }
            }
            
            // 중간
            for(int j = 0; j < size; j++) {
                sum += square[mid][j];
            }
            
            // 아래
            for(int i = mid - 1; i >= 0; i--) {
                for(int j = mid - i; j <= mid + i; j++) {
                    sum += square[size - i - 1][j];
                }
            }
            
            System.out.println("#" + test_case + " " + sum);
        }
        
        sc.close();
    }
}
