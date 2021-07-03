package algorithm.sorting;
public class SelectionSort {
	
	public static void main(String[] args) {
			
		int a[] = {64,25,12,22,11};
		selectionSort(a);
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
	}

	private static void selectionSort(int[] a) {
		int min=0;
		for(int i=0 ;i<a.length;++i)
		{
			min = a[i];
			for(int j=i+1;j<a.length;++j)
			{
				if(min>a[j])
				{
					min=a[j];
					int t = a[j];
					a[j]=a[i];
					a[i]=min;
				}
			}
		}
		
	}

}
