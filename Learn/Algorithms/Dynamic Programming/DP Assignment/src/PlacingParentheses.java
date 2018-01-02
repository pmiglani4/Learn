import java.util.Scanner;

public class PlacingParentheses {
    private static long getMaximValue(String exp) {
      int n= exp.length()/2+1;
      long max[][]=new long[n][n];
      long min[][]=new long[n][n];
      for(int i=0;i<n;i++){
    	  max[i][i]=exp.charAt(i*2)-48;
    	  min[i][i]=exp.charAt(i*2)-48;
      }
      for(int s=1;s<=n-1;s++){
    	  for(int i=0;i<n-s;i++	){
    		  int j=i+s;
    		  MinAndMax(i,j,exp,min,max);
    	  }
      }
      return max[0][n-1];
    }

    private static void MinAndMax(int i, int j, String exp, long[][] min, long[][] max) {
    	long a,b,c,d;
    	min[i][j]=Integer.MAX_VALUE;
    	max[i][j]=Integer.MIN_VALUE;
    	char operator;
    	for(int k=i;k<=j-1;k++){
    		operator = exp.charAt(2*k+1);
    		a=eval(min[i][k],min[k+1][j],operator);
    		b=eval(min[i][k],max[k+1][j],operator);
    		c=eval(max[i][k],min[k+1][j],operator);
    		d=eval(max[i][k],max[k+1][j],operator);
    		min[i][j] = Math.min(min[i][j], Math.min(Math.min(Math.min(a, b),c),d));
    		max[i][j] = Math.max(max[i][j], Math.max(Math.max(Math.max(a, b),c),d));
    	}
	}

	private static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(getMaximValue(exp));
    }
}

