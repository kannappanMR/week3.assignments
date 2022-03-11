package week3.day2.assignments;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class PrintDuplicate {
	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(14);
		obj.add(12);
		obj.add(13);
		obj.add(11);
		obj.add(15);
		obj.add(14);
		obj.add(18);
		obj.add(16);
		obj.add(17);
		obj.add(19);
		obj.add(18);
		obj.add(17);
		obj.add(20);
	
		for (int i = 0; i < obj.size(); i++) {
			for (int j = i+1; j < obj.size(); j++) {
				if(obj.get(i) == obj.get(j)) {
					System.out.println(obj.get(i));
}}}}}