
public class IsPalindrome {

	public static void main(String[] args) {
		isPalindrome("abba");
	    isPalindrome("abbcbba");
	    isPalindrome("geeks");
	    isPalindromeRecursive("abba");
	    isPalindromeRecursive("abbcbba");
	    isPalindromeRecursive("geeks");
	    isPalindrome1("abba");
	    isPalindrome1("abbcbba");
	    isPalindrome1("geeks");

	}

	private static void isPalindrome(String str) {
		int l=0;
		int h=str.length()-1;
		while(h>l){
			if(str.charAt(l++)!=str.charAt(h--)){
				return;
			}
		}
		System.out.println(str +" is a 	Palindrome");
	}
	
	private static void isPalindromeRecursive(String str) {
		if(str.length()==0||str.length()==1){
			System.out.println("Palindrome");
			return;
		}
		if(str.charAt(0)!=str.charAt(str.length()-1)){
			System.out.println("Not Palindrome");
			return;
		}
		isPalindromeRecursive(str.substring(1, str.length()-1));
	}
	
	static boolean isPalRec(String str, int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;
 
        // If first and last characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
 
        // If there are more than two characters,
        // check if middle substring is also
        // palindrome or not.
        if (s < e+1)
            return isPalRec(str, s+1, e-1);
 
        return true;
    }
 
    static void isPalindrome1(String str)
    {
        int n = str.length();
 
    // An empty string is considered as
    // palindrome
        if (n == 0 || isPalRec(str, 0, n-1)){
        	System.out.println(str +" is a 	Palindrome");
        }
    }
 

}
