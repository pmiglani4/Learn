
public class MoveZerosToEnd {

	public static void main(String[] args) {
		
		int arr[]={1,3,0,8,2,0,0,4,0,5,2,0,6,8};
		pusZerosToEnd(arr);
		for(int i : arr){
			System.out.print(i+",");
		}
	}

	private static void pusZerosToEnd(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length){
			arr[count++]=0;
		}
		
	}

}
