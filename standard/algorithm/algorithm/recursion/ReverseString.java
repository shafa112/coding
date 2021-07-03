package algorithm.recursion;

public class ReverseString {

	
	//doubt : string not reflecting back in main..does it only work in local
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="shafa";
		reverseBrute(str);
		reverseIter(str);
		System.out.println("recursive ans="+reverseRecursive(str, str.length()-1));
		System.out.println("reversed str = "+str);

	}

	private static void reverseIter(String str) {
		// TODO Auto-generated method stub
		String reverse="";
		for(int i = str.length()-1 ;i>=0;--i)
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println("reverse better="+reverse);
	}

	private static void reverseBrute(String str) {
		// TODO Auto-generated method stub
		int mid = str.length()/2;
		StringBuilder string = new StringBuilder(str); 
		for(int i =0 ; i <= mid ;++i)
		{
			char ch = str.charAt(i);
	        string.setCharAt(i, str.charAt(str.length()-1-i));
			string.setCharAt(str.length()-1-i, ch);
			
		}
		str=string.toString();
		System.out.println("reverse brute:"+str);
		
	}
	
	private static String reverseRecursive(String str,int i)
	{
		if(i==-1)return "";
		return str.charAt(i)+reverseRecursive(str.substring(0), i-1);
	}
	
	

}
