package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] a = {3, 3, 4, 2, 4, 4, 2, 4};
		majorityElement(a);
	}

	private static void majorityElement(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0 ;i<a.length;++i) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		
		int n= a.length/2;
		for(Map.Entry<Integer, Integer> element : map.entrySet()) {
			if(element.getValue() > n) {
				System.out.println("Majority element: "+element.getKey());
				return;
			}
		}
		System.out.println("No Majority Element");
		
	}

}
