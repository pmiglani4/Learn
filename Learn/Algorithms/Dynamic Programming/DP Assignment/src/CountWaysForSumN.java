
public class CountWaysForSumN {

	public static void main(String[] args) {
		int[] arr = {1,5,6};
		int N = 6;
		System.out.println(countWaysForSumN(arr, N));
		//Complexity O(N*arr.length)
	}

	private static int countWaysForSumN(int[] arr, int N) {
		int result[] = new int[N+1];
		result[0] = 1;
		for(int i = 1; i <= N; i++){
			for(int j = 0;j < arr.length; j++){
				if(i >= arr[j]){
					result[i] += result[i - arr[j]];
				}
			}
		}
		return result[N];
	}

}
