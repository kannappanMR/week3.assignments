package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MissingElementInAnArray {

	public static void main(String[] args) {
List<Integer> obj = new ArrayList<Integer>();
obj.add(1);
obj.add(2);
obj.add(3);
obj.add(4);
obj.add(7);
obj.add(6);
obj.add(8);
int count = 1;
Collections.sort(obj);
for (int i = 0; i < obj.size(); i++) {
		if (obj.get(i) != i+count) {
			System.out.println(i+count);
		break;
	}
}
	
}
}
