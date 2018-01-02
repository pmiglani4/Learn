
public class Binary {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary(12);
		System.out.println();
		decToBinary(12);
		System.out.println();
		double n = 4.47;
	    int k = 3;
	    decimalToBinary(n, k);
	    System.out.println();
	    n = 6.986;
	    k = 5;
	    decimalToBinary(n, k);
	    System.out.println();
	    n = 7.5;
	    k = 5;
	    decimalToBinary(n, k);
	}

	private static void decimalToBinary(double n, int k) {
		int integral=(int)n;
		double fraction=n-integral;
		decToBinary(integral);
		if(fraction>0)
		System.out.print(".");
		while(k>0&&fraction>0){
			k--;
			fraction*=2;
			integral=(int)fraction;
			System.out.print(integral);
			fraction=fraction-integral;
		}
		
	}

	private static void decToBinary(int i) {
		int k=0;
		int res[]=new int[32];
		while(i>0){
			res[k++]=i%2;
			i=i/2;
		}
		for(int j=k-1;j>=0;j--){
			System.out.print(res[j]);
		}
		
	}
	
	private static void binary(int i) {
		if(i>1){
			binary(i/2);
		}
		System.out.print(i%2);
		
	}
	
	

}
