import java.util.*;

public class LCS2 {

    private static void lcs2(int[] a, int[] b) {
        //Write your code here
    	int m=a.length;
    	int n=b.length;
    	int lcs_length[][]= new int[m+1][n+1];
    	for(int i=1;i<=m;i++){
    		for(int j=1;j<=n;j++){
    			if(a[i-1]==b[j-1]){
    				lcs_length[i][j]=lcs_length[i-1][j-1]+1;
    			}else{
    				lcs_length[i][j]=Math.max(lcs_length[i][j-1], lcs_length[i-1][j]);
    			}
    		}
    	}
    	System.out.println("Length of common seusequence"+lcs_length[m][n]);
    	List<Integer> subSequence = new ArrayList<Integer>();
    	while(m>=1 && n>=1){
    		if(a[m-1]==b[n-1]){
    			subSequence.add(a[m-1]);
    			m--;
    			n--;
    		}else if(lcs_length[m][n]==lcs_length[m-1][n]){
    			m--;
    		}else{
    			n--;
    		}
    	}
    	Collections.reverse(subSequence);
    	for (Integer x : subSequence) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int an = scanner.nextInt();*/
        int[] a = {3,7,9,6,8};
        /*for (int i = 0; i < an; i++) {
            a[i] = scanner.nextInt();
        }
        int bn = scanner.nextInt();*/
        int[] b = {9,5,6,3,8,0};
        /*for (int i = 0; i < bn; i++) {
            b[i] = scanner.nextInt();
        }*/
        
        lcs2(a, b);
    }
}

