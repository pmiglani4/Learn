
public class FindFloor {

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 10, 12, 14};
        int n = arr.length;
        int x = 5;
        int index = floorSearch(arr, 0, n - 1, 
                                          x);
        if (index == -1)
            System.out.println("Floor of " + x +
                     " dosen't exist in array ");
        else
            System.out.println("Floor of " + x +
                            " is " + arr[index]);

	}
	/* Function to get index of floor of x in
    arr[low..high] */
	private static int floorSearch(int arr[], int low, 
            int high, int x) {
		// If low and high cross each other
		if(low>high){
			return -1;
		}
		// If last element is smaller than x
		if(x>=arr[high]){
			return -1;
		}
		// Find the middle point
		int mid=(low+high)/2;
		// If middle point is floor.
		if(arr[mid]==x){
			return mid;
		}
		// If x lies between mid-1 and mid
		if(mid>0 && arr[mid-1]<=x&&arr[mid]>x){
			return mid-1;
		}
		if(x<arr[mid])
			return floorSearch(arr, low, mid-1, x);
		return floorSearch(arr, mid+1, high, x);
	}

}
