import java.util.Scanner;

public class GameOfStones {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int t = in.nextInt();
	     boolean result[]=new boolean[t];
	     int noOfStones;
	     for(int i=0;i<t;i++){
	    	 noOfStones = in.nextInt();
	    	 result[i]= (noOfStones%7!=0 && noOfStones%7!=1)?true:false;
	     }
	     for(int i=0;i<t;i++){
	    	 System.out.println(result[i]?"First":"Second");
	     }

	}

}
