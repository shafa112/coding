package algorithm.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[] = {5,12,13,1,56,12};
		bubbleSort(a);
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
	}

	private static void bubbleSort(int[] a) {
		
		for(int i = a.length-1 ; i>0 ; --i)
		{
			for(int j=0;j<i;++j)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}

}
