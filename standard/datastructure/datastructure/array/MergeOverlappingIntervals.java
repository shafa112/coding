package datastructure.array;

import java.util.ArrayList;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		Interval i2 = new Interval(1, 3);
		Interval i1 = new Interval(2, 4);
		Interval i3 = new Interval(5, 7);
		Interval i4 = new Interval(6, 8);
		Interval[] a = {i1,i2,i3,i4};
		//mergeOverlappingIntervals(a);
		
		/*Interval arr[]=new Interval[4]; 
        arr[0]=new Interval(6,8); 
        arr[1]=new Interval(1,9); 
        arr[2]=new Interval(2,4); 
        arr[3]=new Interval(4,7); 
        mergeOverlappingIntervals(arr);*/
		
		ArrayList<Interval> al = new ArrayList<>();
		al.add(new Interval(4,100) );
		al.add(new Interval(1,100));
		al.add(new Interval(2,4));
		al.add(new Interval(4,7));
		mergeOverlappingIntervals(al);
		
 
	}
	
	//for arraylist
	private static ArrayList<Interval> mergeOverlappingIntervals(ArrayList<Interval> a) {
		ArrayList<Interval> ans = new ArrayList<>();
		sortInterval(a);
		int start =a.get(0).start;
		int end=a.get(0).end;
		
		for(int i=1; i<a.size();++i) {
			if(a.get(i).start>=start && a.get(i).start<end) {
				if(end<a.get(i).end) end = a.get(i).end;
			}
			else {
				System.out.println(start+","+end);
				ans.add(new Interval(start, end));
				start=a.get(i).start;
				end=a.get(i).end;
			}
		}
		System.out.println(start+","+end);
		ans.add(new Interval(start, end));
		return ans;
	}
	
	private static void sortInterval(ArrayList<Interval> a) {
		// TODO Auto-generated method stub
		for(int i = a.size()-1 ; i>0 ; --i)
		{
			for(int j=0;j<i;++j)
			{
				if(a.get(j).start>a.get(j+1).start)
				{
					Interval temp=a.get(j);
					a.add(j, a.get(j+1));
					a.add(j+1, temp);
				}
			}
		}
		
	}

	private static void mergeOverlappingIntervals(Interval[] a) {
		sortInterval(a);
		int start =a[0].start;
		int end=a[0].end;
		for(int i=1; i<a.length;++i) {
			if(a[i].start>=start && a[i].start<end) {
				if(end<a[i].end) end = a[i].end;
			}
			else {
				System.out.println(start+","+end);
				start=a[i].start;
				end=a[i].end;
			}
		}
		System.out.println(start+","+end);
	}

	private static void sortInterval(Interval[] a) {
		// TODO Auto-generated method stub
		for(int i = a.length-1 ; i>0 ; --i)
		{
			for(int j=0;j<i;++j)
			{
				if(a[j].start>a[j+1].start)
				{
					Interval temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}

	static class Interval {
		int start;
		int end;
		public Interval(int start,int end) {
			this.start=start;
			this.end=end;
		}
	}

}
