import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t) {
	int m=s.length(),n=t.length();
	int editDistance[][]= new int[m+1][n+1];
	for(int j=0;j<=n;j++){
		editDistance[0][j]=j;
	}
	for(int i=0;i<=m;i++){
		editDistance[i][0]=i;
	}
	int val=Integer.MAX_VALUE;
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
			val= Math.min(editDistance[i-1][j], editDistance[i][j-1])+1;
			if(s.charAt(i-1)==t.charAt(j-1)){
				val=Math.min(val, editDistance[i-1][j-1]);
			}else{
				val=Math.min(val, editDistance[i-1][j-1]+1);
			}
			editDistance[i][j]=val;
		}
	}
    return editDistance[m][n];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
