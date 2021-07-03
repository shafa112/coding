package algorithm.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 5, 10, 11, 25, 31, 109 };
		quickSort(0,a.length-1,a);
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
	}

	private static void quickSort(int start,int last,int[] a) {
		// TODO Auto-generated method stub
		if(start<last)
		{
			int pivot = partition(a,start,last);
			quickSort(start,pivot-1,a);
			quickSort(pivot+1, last, a);
		}
		
	}

	private static int partition(int[] a,int start,int last) {
		
		int pivot = start;
		int i=start+1;
		int j=last;
		while(i<j)
		{
			while(i<=last && a[i]<a[pivot] )++i;
			while(j>=start && a[j]>a[pivot] )--j;
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[pivot];
		a[pivot]=a[j];
		a[j]=temp;
		
		return j;
	}

}
