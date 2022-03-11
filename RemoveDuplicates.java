package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> myset = new LinkedHashSet<String>();

		for (String x : split) {
			myset.add(x);
		}

		Iterator itr = myset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

}
