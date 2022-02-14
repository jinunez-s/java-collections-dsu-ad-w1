package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleLinkedList {
	public static void main(String args[]) {
		//Class linked list
		LinkedList list1 = new LinkedList<>();
		
		Animal bird = new Animal("chiken");
		Animal pig  = new Animal("hog");
		Animal fox = new Animal("artic fox");
		Animal horse = new Animal("mustang");
		Animal duck = new Animal("pijije");
		Animal dog =  new Animal("huskey");
		Animal cow = new Animal("holstein");
		Animal sheep = new Animal("sullfok");
		
		
		System.out.println("Add items to the LinkedList");
		
		//Add item to the LinkedList-- 
		list1.add(bird.name);
		list1.add(pig.name);
		list1.add(fox.name);
		list1.add(horse.name);

		//Push item to the LinkedList
		list1.push(duck.name);
		list1.push(dog.name);		
		interator(list1);
		
		//Get the first item without remove
		System.out.println(" ");
		System.out.println("Get first item of the LinkedList");
		interator(list1);
		String first_item = list1.getFirst().toString();
		System.out.println("First item is: "+ first_item);
		
		
		//Pop the first item. It removes from the LinkedList--
		System.out.println(" ");
		System.out.println("Pop the first item ");
		first_item = list1.pop().toString();
		interator(list1);
						
		
		//Removes the first item and returning the value
		System.out.println(" ");
		System.out.println("Removes items of the LinkedList");
		list1.remove();
		interator(list1);
		
		
		// Poll 
		System.out.println(" ");
		System.out.println("Poll the item of the list");
		list1.poll();		
		interator(list1);
		
		//Retrieves the first element of the LinkedList but not removes
		System.out.println(" ");
		System.out.println("Peek retrieves the first element of the LinkedList but not removes");
		interator(list1);
		System.out.println(list1.peek());
		
		//Allows duplicate variables
		System.out.println(" ");
		System.out.println("Allows duplicate variables");
		list1.add(pig.name);
		list1.add(pig.name);		
		interator(list1);
		
		//Constructs a list containing the elements of the specified collection, 
		//in order they are returned by the collection iterator. 
		System.out.println(" ");
		LinkedList list2 = new LinkedList<>(list1);
		
		list2.add(cow.name);
		list2.add(sheep.name);
		System.out.println("Create a list2 from list1 and added Cow and Sheep");
		interator(list2);
		
		//Update the linkedList list2
		System.out.println(" ");
		System.out.println("Update items to the LinkedList list2 ");		
		//list2.set(0, "Bull");		
		interator(list2);
		
		//iterate
		System.out.println(" ");
		Iterator it =list2.iterator();
		System.out.println("LinkedList elements list2: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	private static void interator(LinkedList<Animal> list1) {		
		System.out.println(list1);		
	}
}

class Animal{
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
}
