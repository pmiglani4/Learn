import java.util.Scanner;

public class ThePowerSum {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int n = sc.nextInt();
	        int k =(int) Math.pow(((double)x),(1.0)/n);
	        System.out.println(totnum(x,n,1));
	        
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }
	 
	 public static int totnum(int X,int N,int num){
		    if(Math.pow(num,N)<X)
		        return totnum(X,N,num+1)+totnum(X-(int)Math.pow(num,N),N,num+1);
		    else if(Math.pow(num,N)==X)
		        return 1;
		    else
		        return 0;
		}

}
