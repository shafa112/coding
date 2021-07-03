package algorithm.recursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(20,15));

	}

	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if(i==0 )return j;
		if(j==0)return i;
		if(i>j)return gcd(i%j,j);
		else return gcd(i,j%i);
	}

}
