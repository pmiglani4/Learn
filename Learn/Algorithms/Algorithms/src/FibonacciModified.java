import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciModified {
	
	 public static void main(String args[] ) throws Exception {
		 Scanner in = new Scanner(System.in);
	        int t1 = in.nextInt();
	        int t2 = in.nextInt();
	        int n = in.nextInt();
	        BigDecimal fib[]=new BigDecimal[n];
	        fib[0]=new BigDecimal(t1);
	        fib[1]=new BigDecimal(t2);
	        for(int i=2;i<n;i++){
	        	fib[i]=fib[i-2].add(fib[i-1].multiply(fib[i-1]));
	        }
	        System.out.println(fib[n-1]);
	 }

}
