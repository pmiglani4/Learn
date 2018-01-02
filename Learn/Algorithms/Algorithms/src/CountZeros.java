
public class CountZeros {
	
	// Driver program to test above functions
    public static void main(String[] args) 
    {
        int arr[] = {1, 1, 0, 0, 0, 0, 0, 0,0};
        int n = arr.length;
        System.out.println("Count of zeroes is " + countZeroes(arr, n));
    }

    /* if 0 is present in arr[] then returns the index of FIRST occurrence
    of 0 in arr[low..high], otherwise returns -1 */
    private static int firstZero(int arr[], int low, int high) {
    	if(low>high){
    		return -1;
    	}
    	int mid=(low+high)/2;
    	if(arr[mid]==0&&(mid==0||arr[mid-1]==1)){
    		return mid;
    	}
    	 if (arr[mid] == 1) // If mid element is not 0
             return firstZero(arr, (mid + 1), high);
         else // If mid element is 0, but not first 0
             return firstZero(arr, low, (mid - 1));
    }
	private static int countZeroes(int[] arr, int n) {
		int firstZeroIndex = firstZero(arr, 0, n-1);
		if(firstZeroIndex!=-1){
			return n-firstZeroIndex;
		}
		// If 0 is not present at all, return 0
		return 0;
	}

}
