
public class StringRotation {
	
	/* Function checks if passed strings (str1 and str2)
    are rotations of each other */
	 static boolean areRotations(String str1, String str2)
	 {
	     // There lengths must be same and str2 must be 
	     // a substring of str1 concatenated with str1.  
	     return (str1.length() == str2.length()) &&
	            ((str1 + str1).indexOf(str2) != -1);
	 }
	  
	 // Driver method
	 public static void main (String[] args)
	 {
	     String str1 = "AACD";
	     String str2 = "ACDA";
	
	     if (areRotations(str1, str2))
	         System.out.println("Strings are rotations of each other");
	     else
	         System.out.printf("Strings are not rotations of each other");
	     
	     
	     System.out.println((isRotationOfPalindrome("aab")) ? 1 : 0);
        System.out.println((isRotationOfPalindrome("abcde")) ? 1 : 0);
        System.out.println((isRotationOfPalindrome("aaaad")) ? 1 : 0);
	 }
	 
	 // A utility function to check if a string str is palindrome
	    static boolean isPalindrome(String str)
	    {
	        // Start from leftmost and rightmost corners of str
	        int l = 0;
	        int h = str.length() - 1;
	 
	        // Keep comparing characters while they are same
	        while (h > l)
	            if (str.charAt(l++) != str.charAt(h--))
	                return false;
	 
	        // If we reach here, then all characters were matching
	        return true;
	    }
	     
	    // Function to check if a given string is a rotation of a
	    // palindrome
	    static boolean isRotationOfPalindrome(String str)
	    {
	        // If string iteself is palindrome
	        if (isPalindrome(str))
	            return true;
	 
	        // Now try all rotations one by one
	        int n = str.length();
	        for (int i = 0; i < n-1; i++)
	        {
	            String str1 = str.substring(i+1);
	            String str2 = str.substring(0, i+1);
	 
	            // Check if this rotation is palindrome
	            if (isPalindrome(str1 + str2))
	                return true;
	        }
	        return false;
	    }

}
