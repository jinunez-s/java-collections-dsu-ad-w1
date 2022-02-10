package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Animal {
	public static void main(String args[]) {
		ArrayList <String> list1 = new ArrayList<String>();//Only Strings
		
		String name1, name2, name3, name4;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first animal");
		name1 = scanner.nextLine();
		System.out.println("Enter the second animal");
		name2 = scanner.nextLine();
		System.out.println("Enter the third animal");
		name3 = scanner.nextLine();
		System.out.println("Enter the fourth animal");
		name4 = scanner.nextLine();
		scanner.close();
		System.out.println("Done!, the animals were added to the farm!");
		
		//Add element of the Array List
		list1.add(name1);
		list1.add(name2);
		list1.add(name3);
		list1.add(name4);
		list1.add("Cow");
		list1.add("Chiken");
		list1.add("Pig");
		list1.add("Horse");
		list1.add("Fox");
		
		System.out.println("The animals in the farm are: ");
		
		interator(list1);
		System.out.println("Let's remove one animal");
		//Array remove
		list1.remove(2);
		System.out.println("The animals in the farm are: ");
		interator(list1);
		System.out.println("Let's change the position #2");
		//Update Array list
		list1.set(2, "bird");
		System.out.println("The animals in the farm are: ");
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

