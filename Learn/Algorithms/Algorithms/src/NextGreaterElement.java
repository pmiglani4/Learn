import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int arr[]={4,5,2,25};
		int arr1[]={13,7,6,12};
		printNextGreaterElement(arr);
	}

	private static void printNextGreaterElement(int[] arr) {
		Stack<Integer> s =new Stack<>();
		s.push(arr[0]);
		int next,element;
		for(int i=1;i<arr.length;i++){
			next=arr[i];
			if(!s.isEmpty()){
				element=s.pop();
				while(element<next){
					System.out.println("Next greater element for "+element+" is: "+next);
					if(s.isEmpty())
						break;
					element=s.pop();
				}
				if(element>next){
					s.push(element);
				}
			}
			s.push(next);
		}
		while(!s.empty()){
			element=s.pop();
			System.out.println("Next greater element for "+element+" is: -1");
		}
		
		
	}

}
