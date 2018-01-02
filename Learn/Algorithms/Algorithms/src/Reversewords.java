import java.util.Scanner;

public class Reversewords {

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    reversewords(input);
	}
	
	public static void reversewords(String input){
	    String[] words= input.split(".");
	    for(int i=words.length-1;i>0;i--){
	        System.out.print(words[i]+".");
	    }
	    System.out.print(words[0]);
	}

}
