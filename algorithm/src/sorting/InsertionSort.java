package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {24,55,1,-1};
		insertionSort(a);
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");

	}

	private static void insertionSort(int[] a) {
		// TODO Auto-generated method stub
		int pos = 0;
		int temp = 0;
		for(int i=1;i<a.length;++i)
		{
			temp=a[i];
			pos =i;
			for(int j=i-1 ; j>=0 && temp<a[j];j--)
			{
				a[j+1]=a[j];
				pos=j;
			}
			a[pos]=temp;
			
			
		}
		
	}

}
