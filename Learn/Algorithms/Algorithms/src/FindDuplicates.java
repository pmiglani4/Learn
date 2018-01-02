
public class FindDuplicates {

	public static void main(String[] args) {
		int arr[]={1,3,8,2,4,5,2,6,8};
		printDuplicates(arr);

	}

	private static void printDuplicates(int[] arr) {
		for(int i=0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])]>0){
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}else{
				System.out.println(Math.abs(arr[i]));
			}
		}
		
	}

}
