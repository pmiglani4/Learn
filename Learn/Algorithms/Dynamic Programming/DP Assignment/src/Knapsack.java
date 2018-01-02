	import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
    	int noOfWeights = w.length;
    	int optimalWeightvalue[][] = new int[noOfWeights+1][W+1];
    	int val;
    	for(int i=0; i<=noOfWeights; i++){
    		for(int j=0; j<=W; j++){
    			if(i==0 || j==0){
    				optimalWeightvalue[i][j]=0;
    				continue;
    			}
    			optimalWeightvalue[i][j]=optimalWeightvalue[i-1][j];
    			if(w[i-1]<=j){
    				val=optimalWeightvalue[i-1][j-w[i-1]]+w[i-1];
    				if(val>optimalWeightvalue[i][j]){
    					optimalWeightvalue[i][j]=val;
    				}
    			}
    		}
    	}
        return optimalWeightvalue[noOfWeights][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

