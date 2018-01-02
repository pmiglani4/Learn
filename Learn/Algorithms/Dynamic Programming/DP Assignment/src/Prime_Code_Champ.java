import java.util.Scanner;

public class Prime_Code_Champ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int k = scanner.nextInt();
        System.out.println(getSizeOfSubstringWithConsonants(str, k));

	}

	private static int getSizeOfSubstringWithConsonants(String str, int k) {
		int str_len = str.length();
		if(str_len < k)
			return -1;
		int noOfConsonants = 0;
		int result[][] = new int[str_len+1][str_len+1];
		for(int i=1;i<=str_len;i++){
			if(isVovel(str.charAt(i-1))){
				result[i][i]=0;
			}else{
				result[i][i]=1;
				noOfConsonants++;
			}
		}
		if(noOfConsonants<k){
			return -1;
		}
		for(int len=2;len<=str_len;len++){
			boolean flag=true;
			for(int i=1;i<=str_len-len+1;i++){
				int j=i+len-1;
				result[i][j]=result[i][j-1]+result[j][j];
				if(result[i][j]<k){
					flag=false;
				}
			}
			if(flag){
				return len;
			}
		}
		return -1;
		
	}

	private static boolean isVovel(char ch) {
		return (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')? true: false;
	}

}
