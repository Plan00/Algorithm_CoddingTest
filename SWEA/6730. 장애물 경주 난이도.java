import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] hei = new int[N];
			int[] up = new int[N];
			int[] down = new int[N];
			int upM = 0;
			int downM = 0;
			int j = 0;	// up 배열 인덱스
			int k = 0;	// down 배열 인덱스
			
			for(int i=0; i<hei.length; i++) {
				hei[i] = sc.nextInt();
			}
			
			for(int i=0; i<hei.length-1; i++) {
				
				// up
				if(hei[i] < hei[i+1]) {
					up[j] = hei[i+1] - hei[i];
					j++;
				}
				
				// down
				else{
					down[k] = hei[i] - hei[i+1];
					k++;
				}
			}
			
			for(int i=0; i<up.length; i++) {
				if(up[i] > upM)	upM = up[i];
			}
			
			for(int i=0; i<down.length; i++){
				if(down[i] > downM)	downM = down[i];
			}
			
			System.out.println("#" + test_case + " " + upM + " " + downM);
		}

		sc.close();
    }
}
