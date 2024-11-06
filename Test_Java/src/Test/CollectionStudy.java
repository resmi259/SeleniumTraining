package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



//Collection Interface doesnt support index where as List support Index 

//Set doest support duplicate values and no order for data retrival 

public class CollectionStudy {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Collection <Integer> nums = new ArrayList();
//		nums.add(5);
//		nums.add(3);
//		nums.add(4);
//		nums.add(9);
//		nums.add(0);
//		
//		for (int n:nums)
//			
//		{System.out.println(n);
//		
//
//	}
		
//		List <Integer> nums = new ArrayList();
//		nums.add(5);
//		nums.add(3);
//		nums.add(4);
//		nums.add(9);
//		nums.add(0);
//		
//				
//		{System.out.println(nums.get(0));
//		
//
//	}
		
	Set <Integer> nums = new HashSet<>();
	nums.add(5);
	nums.add(6);
	nums.add(5);
	
	
	//for (int n : nums)
	//{
	//System.out.println(n);  //duplicate will not be printed 
	//}
	
	Set <Integer> nums1 = new HashSet<>();
	nums1.add(5);
	nums1.add(6);
	nums1.add(5);
	
	
	Iterator <Integer> values = nums1.iterator();
	while(values.hasNext())
		
	{
		System.out.println(values.next());
	}
		

}
}
