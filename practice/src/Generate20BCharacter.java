
public class Generate20BCharacter {

	public static void main(String[] args) {
		int[] sort = {10, 8, 12, 3, 21, 5 ,15};
		//bubbleSort(sort);
		//selectionSort(sort);
		insertionSort(sort);
		System.out.println("sorted array :");
		for(int i=0;i<sort.length;++i) {
			System.out.print(sort[i]+" ");
		}

	}

	private static void insertionSort(int[] sort) {
		// TODO Auto-generated method stub
		
	}

	private static void selectionSort(int[] sort) {
		
		for(int i=0; i<sort.length-1;++i) {
			int smallestValueIndex = i;
			for(int j=i+1 ;j<sort.length ;++j)
			{
				if(sort[smallestValueIndex] > sort[j]) {
					smallestValueIndex = j;
				}
			}
			int temp = sort[i];
			sort[i] = sort[smallestValueIndex];
			sort[smallestValueIndex] = temp;
		}
		
	}

	private static void bubbleSort(int[] sort) {
		System.out.println("unsorted array :");
		for(int i=0;i<sort.length;++i) {
			System.out.print(sort[i]+" ");
		}
		
		for(int i=sort.length-1 ; i>=0; --i) {
			for(int j=0;j<i;++j) {
				if(sort[j] > sort[j+1]) {
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
		System.out.println();
	}
	
	

}
