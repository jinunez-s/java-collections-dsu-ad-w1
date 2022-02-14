package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {

	public static void main(String args[]) {
		
		LinkedHashSet<Animal> linkHS = new LinkedHashSet<>();
		
		Animal bird = new Animal("macaw");
		Animal horse = new Animal("mustang");
		Animal duck = new Animal("pijije");
		Animal pig = new Animal("hog");
		Animal chiken = new Animal("chiken");
		Animal dog = new Animal("huskey");
		
		//Add elements
		linkHS.add(bird);
		linkHS.add(horse);
		linkHS.add(duck);
		linkHS.add(pig);
		linkHS.add(chiken);
		
		//Iterate through elements
		System.out.println(" ");
		System.out.println("Iterate elements: ");
		Iterator<Animal> it = linkHS.iterator();
		
		while(it.hasNext()) {
			Animal message = it.next();
			System.out.println(message.name);
		}
		
		//Remove elements
		System.out.println(" ");
		System.out.println("Remove elements: ");
		linkHS.remove(duck);
		Iterator<Animal> it2 = linkHS.iterator();
		
		while(it2.hasNext()) {
			Animal message = it2.next();
			System.out.println(message.name);
		}
		
		//Update element
		System.out.println(" ");
		System.out.println("Update elements: ");
		
		if(linkHS.contains(chiken)) {
			linkHS.add(dog);
		}
		Iterator<Animal> it3 = linkHS.iterator();
		
		while(it3.hasNext()) {
			Animal message = it3.next();
			System.out.println(message.name);
		}
		
	}
}

class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
}