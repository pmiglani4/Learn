import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
        System.out.println(oddNumbers(2,5));
    }
        
        static int[] oddNumbers(int l, int r) {
            int res[]=new int[(l-r)/2+2];
            l=l%2==0?l+1:l;
            int k=0;
            while(l<=r){
               res[k++]=l;
               l=l+2;
            }
            return res;

        }

}
