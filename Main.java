package Assign9_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		System.out.println("Adding strings to sets.");
		for(int i = 0; i < 5; i++) {
			set1.add("String" + (i+1));
			set2.add("String" + (i+10));
		}
		
		System.out.println("Printing sets.");
		System.out.println("Set1");
		for (String string : set1) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		System.out.println("Set2");
		for (String string : set2) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		System.out.println("Joining sets");
		set1.addAll(set2);
		System.out.println("Set1");
		for (String string : set1) {
			System.out.print(string + " ");
		}
	}
}