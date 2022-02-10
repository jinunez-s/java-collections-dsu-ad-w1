package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Animal {
	public static void main(String args[]) {
		ArrayList <String> list1 = new ArrayList<String>();//Only Strings
		ArrayList <String> list2 = new ArrayList<String>();
		
		//Add element of the Array List
		list1.add("Cat");
		list1.add("Dog");
		list1.add("Mouse");
		list1.add("Lizard");
		list1.add("Cow");
		list1.add("Chiken");
		list1.add("Pig");
		list1.add("Horse");
		list1.add("Fox");

		interator(list1);
		
		//Array remove
		list1.remove(2);
		
		interator(list1);
		
		//Update Array list
		list1.set(2, "bird");
				
		interator(list1);
		
		//Iterate in ArrayList
		System.out.println("---Iterating with For Loop ---");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("-------");
		
		System.out.println("--- Iterating with Enhanced For Loop");
		for(String str : list1) {
			System.out.println(str);
		}
		System.out.println("------");
		
		System.out.println("---Iterating with Iterator---");
		Iterator<String> itr = list1.iterator();
		
		//Printing one by one
		System.out.println(itr.next());// Only one per next
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		//Printing with loop
		System.out.println("--- Iterating with Iterator and While ---");
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println("------");
		
		// Clear all elements of the ArrayList
		list1.clear();
		
		
		
		interator(list1);
	}

	private static void interator(ArrayList<String> list1) {
		System.out.println(list1);		
	}
	
}

