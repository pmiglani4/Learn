
public class Sort012 {
	
	public static void main (String[] args)
    {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        boolean arraySorted = sort012(arr);
        if(arraySorted){
        	System.out.println("Array after seggregation ");
            printArray(arr);
        }else{
        	System.out.println("Array should contain 0,1 and 2 only...Invalid input");
        }
        
        int arr1[] = {0, 1, 0, 1, 1, 1};
        if(segregate0and1(arr1)){
        	System.out.println("\nArray after seggregation ");
            printArray(arr1);
        }else{
        	System.out.println("Array should contain 0,1 only...Invalid input");
        }
    }

	private static void printArray(int[] arr) {
		for(int a : arr){
			System.out.print(a+" ");
		}
		
	}

	private static boolean sort012(int[] arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high){
			if(arr[mid]==1){
				mid++;
			}else if(arr[mid]==0){
				arr[mid]=1;
				arr[low]=0;
				low++;
				mid++;
			}else if(arr[mid]==2){
				arr[mid]=arr[high];
				arr[high]=2;
				high--;
			}else{
				return false;
			}
		}
		return true;
	}
	
	private static boolean segregate0and1(int[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			if(arr[left]==0){
				left++;
			}else if(arr[left]==1){
				arr[left]=arr[right];
				arr[right]=1;
				right--;
			}else{
				return false;
			}
		}
		return true;		
		
	}

}
