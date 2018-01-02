
public class PrintMaxSubSquare {
	
	public static void main(String args[]){
		int arr[][]={
				{0,1,1,0,1},
				{1,1,0,1,0},
				{0,1,1,1,0},
				{1,1,1,1,0},
				{1,1,1,1,1},
				{0,0,0,0,0}
		};
		printMaxSubSquare(arr);
	}

	private static void printMaxSubSquare(int[][] arr) {
		int row = arr.length;
		int column = arr[0].length;
		int res[][] = new int[row][column];
		int max = 0, max_i_pos = 0, max_j_pos = 0;
		for(int i = 0 ; i < row ; i++){
			for(int j = 0; j < column; j++){
				if(i == 0  || j == 0){
					res[i][j] = arr[i][j];
				}else if(arr[i][j] == 1){
					res[i][j] = Math.min(res[i-1][j-1], Math.min(res[i-1][j], res[i][j-1])) + 1;
				}else{
					res[i][j] = 0;
				}
			}
		}
		for(int i = 0 ; i < row ; i++){
			for(int j = 0; j < column; j++){
				if(max < res[i][j]){
					max = res[i][j];
					max_i_pos = i;
					max_j_pos = j;
				}
			}
		}
		System.out.println("Size of Max SubSquare is " + max);
		System.out.println("Max SubSquare is:");
		for(int i = max_i_pos ; i > max_i_pos - max ; i--){
			for(int j = max_j_pos; j > max_j_pos - max; j--){
				System.out.print(arr[i][j] + ",");
			}
			System.out.println();
		}
		
	}

}
