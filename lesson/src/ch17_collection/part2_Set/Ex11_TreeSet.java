package ch17_collection.part2_Set;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_TreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(15); set.add(96); set.add(12); set.add(51); set.add(80); set.add(7); set.add(11);
		System.out.println(set);
		
		Set<String> strSet = new TreeSet<String>();
		strSet.add("N"); strSet.add("T"); strSet.add("R"); strSet.add("S"); strSet.add("O"); strSet.add("Q");
		System.out.println(strSet);

	}

}
