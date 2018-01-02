import java.util.Scanner;

public class AppleAndOrangeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int pos;
        int result=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            pos=a+apple[apple_i];
            if(pos>=s&&pos<=t){
                result++;
            }
        }
       
        int result1=0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            pos=b+orange[orange_i];
            if(pos>=s&&pos<=t){
                result1++;
            }
        }
        System.out.println(result);
        System.out.println(result1);
    }
}
