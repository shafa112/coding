package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,2,5};
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
	}

	private static void mergeSort(int[] a,int start,int end) {
		// TODO Auto-generated method stub
		if(start != end) {	
			int mid = (start+end)/2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a,start,mid,end);
		}
		
	}

	private static void merge(int[] a, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int[] c = new int[end-start+1];
		int k = 0;
		int i=start;
		int j =mid+1 ;
		for( i = start, j= mid+1 ;i<=mid && j<=end;) {
			if(a[i]<a[j]) {
				c[k] = a[i];
				++i;
			}
			else {
				c[k] = a[j];
				++j;
			}
			++k;
		}
		
		while(i<=mid) {
			c[k] = a[i];
			++i;
			++k;
		}
		
		while(j<=end) {
			c[k] = a[j];
			++j;
			++k;
		}
		for(int z = 0 ;z<c.length;++z)a[start+z]=c[z];
		
	}

}
