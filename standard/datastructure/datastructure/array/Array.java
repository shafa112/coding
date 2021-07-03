package datastructure.array;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Array {

	public static void main(String[] args) {
		//int[] a ={3, 3, 4, 2, 4, 4, 2, 4, 4};
		//majorityElement(a);	--complete
		
		//int[] a = {0,0, 0, 0, 0, 1, 1, 1};
		//sortZerosAndOnes(a);  --complete
		
		//int[] a = {1,0,0,2,0,2,1};
		//sortZerosOnesTwos(a);  --complete
	    
		//int[] a = {1, 5, 7, -1, 5};
		int sum = 6;
		int[] b = {2, 5, 17, -1};
		int sum2 = 7;
		//printAllPairsWithGivenSumVersion1(a, sum); //O(n2)
		//printAllPairsWithGivenPair(a,sum); //using map but have a doubt here
		
		/*int[] r = {1,2,3,4,5,6,7};
		rotateArray(r, 2);
		printArray(r);*/
		
		/*int[] a = {3,4,1,4,1};
		//System.out.println(maxSubArraySum(a));
		System.out.println(findFirstDuplicate(a));*/
		
		int[][] spiral = { {1}, {2},{3}	};
		//printSpiral(spiral.length, spiral[0].length, spiral);
		int[] a ={3, 1, 3};
	}
	
	public static int[] printSpiral(int nRows, int nCols,int[][] a) {
		int[] result = new int[nRows*nCols];
		int y=0;
		int i =0,j=0;
		while(i<nRows && j<nCols) {
			//printing left to right
			for(int k=j;k<nCols;++k) {
				result[y]=a[j][k];
				++y;
				System.out.print(a[j][k]+" ");
			}
			i=i+1;
			//printing top to bottom
			for(int k=i;k<nRows;++k ) {
				result[y]=a[k][nCols-1];
				++y;
				System.out.print(a[k][nCols-1]+" ");
			}
			--nCols;

			//print right to left
		if(i<nRows) {
			for(int k=nCols-1;k>=j;--k) {
				result[y]=a[nRows-1][k];
				++y;
				System.out.print(a[nRows-1][k]+" ");
			}
			--nRows;
		}
			
			//print bottom to top
			if(j<nCols) {
				for(int k = nRows-1;k>=i;--k) {
					result[y]=a[k][j];
					++y;
					System.out.print(a[k][j]+" ");
				}
				j=j+1;
			}
		}
		return result;
	}
	
	
	public static int findFirstDuplicate(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<a.length;++i) {
			if(map.containsKey(a[i])) return a[i];
			map.put(a[i], 1);
		}
		return 0;
	}
	
	public static int maxSubArraySum(int[] a) {
		int max_so_far = a[0]; 
	    int curr_max = a[0]; 
	  
	    for (int i = 1; i < a.length; i++) 
	    { 
	           curr_max = Math.max(a[i], curr_max+a[i]); 
	        max_so_far = Math.max(max_so_far, curr_max); 
	    } 
		return max_so_far;
	}
	
	public static void rotateArray(int[] a,int n) {
		Stack<Integer> s = new Stack<>();
		for(int i =0 ; i<n ;++i) {
			s.push(a[i]);
		}
		
		int i=0;
		for(i =0; (i+n)<a.length; ++i) {
			a[i] = a[i+n];
		}
		
		while(i<a.length) {
			a[i] = s.pop();
			++i;
		}
	}
	
	private static void printAllPairsWithGivenPair(int[] a, int sum) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<a.length-1; ++i) {
			map.put(i, a[i]);
		}
		
		for(int i =0 ; i<a.length ;++i) {
			if(map.containsValue(sum-a[i])) {
				System.out.println("("+a[i]+","+(sum-a[i])+")");
				map.remove(i); //prints a pair only once but if number occurs twice -doubt
			}
		}
		
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;++i) {
			System.out.print(a[i]+" ");
		}
	}
	
	//O(n2)
	private static void printAllPairsWithGivenSumVersion1(int[] a, int sum) {
		for(int i=0; i<a.length; ++i) {
			for(int j=i+1; j<a.length; ++j) {
				if(a[i]+a[j] == sum) {
					System.out.println("("+a[i]+","+a[j]+")");
					//break; //with break only unique pairs are printed
				}
			}
		}
	}
	
	public static void sortZerosAndOnes(int[] a) {
		int i = 0;
		int j = a.length-1;
		while(i<j) {
			if(a[i]==1 && a[j]==0)	{
				int temp =a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			if(a[i]==0)++i;
			if(a[j]==1)--j;
		}
	}

	private static void sortZerosOnesTwos(int[] a) {
		//first sorting 0s and 1s
		int i = 0;
		int j = a.length-1;
		while(i<j) {
			if(a[i]==1 && a[j]==0)	{
				int temp =a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			if(a[i]==0)++i;
			if(a[j]==1 || a[j]==2)--j;
		}
		
		//now sorting 1s and 2s
		i=j+1;
		j=a.length-1;
		while(i<j) {
			if(a[i]==2 && a[j]==1)	{
				int temp =a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			if(a[i]==1)++i;
			if(a[j]==2)--j;
		}
	}
	
	private static void majorityElement(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0 ; i<a.length;++i) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				int count = map.get(a[i]);
				map.put(a[i], count+1);
			}
		}
		
		int majorityElement =0;
		int maxCount = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(maxCount<entry.getValue()) {
				maxCount = entry.getValue();
				majorityElement = entry.getKey();
				if(maxCount>a.length/2) {
					System.out.println("majority ele found:"+majorityElement);
					return;
				}
			}
		}
		System.out.println("not found");
	}

}
