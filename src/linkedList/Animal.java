package linkedList;

import java.util.LinkedList;

public class Animal {
	public static void main(String args[]) {
		//Class linked list
		LinkedList <String> list1 = new LinkedList<String>();
		
		String name1 = "Chiken", name2 = "Pig", name3 = "Fox", name4 = "Eagle";
		//Add item to the LinkedList-- 
		list1.add(name1);
		list1.add(name2);
		list1.add(name3);
		list1.add(name4);
		
		interator(list1);

		//Push item to the LinkedList
		list1.push("Duck");
		list1.push("Horse");
		
		interator(list1);
		
		//Get the first item without remove
		String first_item = list1.getFirst();
		
		System.out.println("First item is: "+ first_item);
		interator(list1);

		//Pop the first item. It removes from the LinkedList--
		first_item = list1.pop();
				
		System.out.println("First item was: "+ first_item);
		interator(list1);
		
		first_item = list1.getFirst();
				
		System.out.println("First item is: "+ first_item);	
		interator(list1);
		
		//Removes the first item and returning the value
		list1.remove();
		
		list1.poll();
		
		interator(list1);
		
		//Retrieves the first element of the LinkedList but not removes
		System.out.println(list1.peek());
		
		//Allows duplicate variables
		list1.add("Pig");
		list1.add("Pig");
		
		interator(list1);
		
		//Constructs a list containing the elements of the specified collection, 
		//in order they are returned by the collection iterator. 
		LinkedList<String> list2 = new LinkedList<String>(list1);
		
		list2.add("Cow");
		list2.add("Sheep");
		interator(list2);
	}

	private static void interator(LinkedList<String> list1) {
		
		System.out.println(list1);
		
	}
}
