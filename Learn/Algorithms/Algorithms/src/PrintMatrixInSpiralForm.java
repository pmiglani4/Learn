
public class PrintMatrixInSpiralForm {

	public static void main(String[] args) {
		int arr[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		printMatrixInSpiralForm(arr, arr.length,arr[0].length);

	}

	private static void printMatrixInSpiralForm(int[][] arr, int m, int n) {
		int k=0;//k is starting row
		int l=0;//l is starting column
		while(k<m&&l<n){
			//left to right
			for(int i=l;i<n;i++){
				System.out.print(arr[k][i]+",");
			}
			k++;
			//top to down
			for(int i=k;i<m;i++){
				System.err.print(arr[i][n-1]+",");
			}
			n--;
			
			//right to left
			if(k<m){
				for(int i=n-1;i>=l;i--){
					System.out.print(arr[m-1][i]+",");
				}
				m--;
			}
			
			//down to top
			if(l<n){
				for(int i=m-1;i>=k;i--){
					System.out.print(arr[i][l]+",");
				}
				l++;
			}
			
		}
		
	}

}
