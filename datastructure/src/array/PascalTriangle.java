package array;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPascalTriangle(5);

	}

	private static void printPascalTriangle(int n) {
		ArrayList<Integer>[] a = new ArrayList[n];
		for(int i=0; i<n ;++i)a[i]= new ArrayList<>();
		a[0].add(1);
		a[1].add(1);
		a[1].add(1);
		for(int i=1;i+1<n;++i) {
			a[i+1].add(1);
			for(int j=0;j+1<a[i].size();++j) {
				a[i+1].add(a[i].get(j)+a[i].get(j+1));
			}
			a[i+1].add(1);
		}
		printArray(a);
		//ArrayList<ArrayList<Integer>> al = Arrays.asList(a);
	}
	

	private static void printArray(ArrayList<Integer>[] a) {
		// TODO Auto-generated method stub
		for(int i =0;i<a.length;++i) {
			for(int j=0;j<a[i].size();++j)
				System.out.print(a[i].get(j)+" ");
			System.out.println();
		}
		
	}

}
