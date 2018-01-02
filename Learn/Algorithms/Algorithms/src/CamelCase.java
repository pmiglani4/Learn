import java.util.Scanner;

public class CamelCase {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result=0;
        if(s.length()>=0){
        	result=1;
        }
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
        		result++;
        	}
        }
        System.out.println(result);
    }
	
}
