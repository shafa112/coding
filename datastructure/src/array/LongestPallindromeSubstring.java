package array;

public class LongestPallindromeSubstring {

	public static void main(String[] args) {
		
		String str = "geekskeegsfor"; 
		System.out.println("ans: "+longestPallindromeSubstring(str));
	}

	private static String longestPallindromeSubstring(String str) {
		
		String maxLengthPallindromeSubstring = "";
		for(int i = 0; i <str.length() ; ++i) {
			
			for(int j = str.length()-1 ; j>=i ; --j) {
				
				if(isPallindrome(str.substring(i, j)))
				{
					if( str.substring(i, j).length() > maxLengthPallindromeSubstring.length())
						maxLengthPallindromeSubstring = str.substring(i, j);
				}
			}
		}
		return maxLengthPallindromeSubstring;
	}

	private static boolean isPallindrome(String substringStr) {
		
		for(int i =0, j=substringStr.length()-1;i<substringStr.length() && j>=0 && i!=j ;++i,--j)
		{
			if(substringStr.charAt(i) != substringStr.charAt(j))
				return false;
		}
		return true;
	}
}
