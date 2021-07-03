package algorithm.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {2,3,10,12};
		int pos = linearSearch(a,10);
		if(pos!=-1)
		{
			System.out.println("element found at pos:"+(pos+1));
		}
		else System.out.println("not found");

	}

	private static int linearSearch(int[] a,int element) {
		
		int pos= -1;
		for(int i =0 ; i < a.length ; ++i)
		{
			if(a[i]==element)
			{
				pos = i;
				break;
			}
		}
		return pos;
		
	}

}
