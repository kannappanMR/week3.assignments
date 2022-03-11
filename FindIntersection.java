package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
//a) Declare An array for {3,2,11,4,6,7};	 
		// * b) Declare another array for {1,2,8,4,9,7};
		// * c) Declare for loop iterator from 0 to array length //

		List<Integer> obj = new ArrayList<Integer>();
		obj.add(3);
		obj.add(2);
		obj.add(11);
		obj.add(4);
		obj.add(6);
		obj.add(7);

		List<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(8);
		obj1.add(4);
		obj1.add(9);
		obj1.add(7);
		for (Integer elements : obj) {

			for (Integer elements1 : obj1) {

				if (elements == elements1) {
					System.out.println(elements1);
				}

			}

		}
	}
}
