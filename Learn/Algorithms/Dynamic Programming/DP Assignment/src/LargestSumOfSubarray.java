
public class LargestSumOfSubarray {
	
	public static void main(String[] args) {
		int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
		largestSumOfSubarray(arr);
		//Complexity O(arr.length)
	}

	private static void largestSumOfSubarray(int[] arr) {
		int max_so_far = Integer.MIN_VALUE; int max_ending_here = 0;
		int start = 0, end = 0, s = 0; 
		for(int i = 0; i < arr.length; i++){
			max_ending_here += arr[i];
			if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}
			if(max_ending_here <= 0){
				max_ending_here = 0;
				s = i+1;
			}
		}
		System.out.print("Largest sum is "+max_so_far+" made by subarray elements: ");
		for(int i = start; i <= end; i++){
			System.out.print(arr[i]+", ");
		}
	}
	
}
