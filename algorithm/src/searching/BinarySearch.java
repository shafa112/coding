package searching;
//works on sorted data
public class BinarySearch {
	
	public static void main(String[] args) {
		int a[] = {2,3,10,12,30};
		int pos = binarySearch(a,30);
		if(pos!=-1)
		{
			System.out.println("element found at pos:"+(pos+1));
		}
		else System.out.println("not found");

	}

	private static int binarySearch(int[] a, int element) {
		int pos= -1;
		
		int start = 0;
		int end = a.length-1;
		int mid = (start+end)/2;
		while(start<=end)
		{
			mid = (start+end)/2;
			if(a[mid]==element)
			{
				pos = mid;
				break;
			}
			if(element<a[mid])
			{
				end=mid-1;
			}
			if(element>a[mid])
			{
				start=mid+1;
			}
		}
		return pos;
	}

}
