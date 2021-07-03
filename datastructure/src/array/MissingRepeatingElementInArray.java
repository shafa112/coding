package array;

import java.util.ArrayList;
import java.util.List;

public class MissingRepeatingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingRepeatingElementInArray m = new MissingRepeatingElementInArray();
		ArrayList<Integer> input = new ArrayList<>();
		
		input.add(1);
		input.add(3);
		input.add(2);
		input.add(1);
		input.add(5);
		
		ArrayList<Integer> output = m.repeatedNumber(input);
		for(int i =0;i<output.size();++i)
		{
			System.out.print(output.get(i)+" ");
		}
		

	}
	
	//	Space complexity : 0(n)
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
		int[] temp = new int[A.size()+1];
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i =0 ; i<A.size();++i)
		{
			if(temp[A.get(i)]==0)
			{
				temp[A.get(i)]=1;
			}
			else if(temp[A.get(i)]==1)
			{
				ans.add(A.get(i));
			}
		}
		
		for(int i=1;i<temp.length;++i) {
			if(temp[i]==0)
				ans.add(i);
		}
		return ans;
    }

}
