package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
List<Integer> obj = new ArrayList<Integer>();
obj.add(3);
obj.add(2);
obj.add(11);
obj.add(4);
obj.add(6);
obj.add(7);
Collections.sort(obj);	
System.out.println(obj.size());
System.out.println(obj.get(4));
	

	}

}
