package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {

	public static void main(String args[]) {
		HashSet<Animal> hs = new HashSet();
		
		Animal bird = new Animal("duck");
		Animal pig  = new Animal("hog");
		Animal horse = new Animal("mustang");
		Animal dog =  new Animal("huskey");
		Animal cow = new Animal("angus");
		Animal sheep = new Animal("dorper");
		
		hs.add(bird);
		hs.add(pig);
		hs.add(horse);
		hs.add(horse);
		hs.add(dog);
		hs.add(cow);
		
		//Iterate through elements
		System.out.println(" ");
		System.out.println("Iterate elements: ");
		Iterator<Animal> it = hs.iterator();
		
		while(it.hasNext()) {
			Animal message = it.next();
			System.out.println(message.name);
		}
		//Remove element
		System.out.println(" ");
		System.out.println("Remove element: ");
		hs.remove(horse);
		Iterator<Animal> it2 = hs.iterator();		
		while(it2.hasNext()) {
			Animal message = it2.next();
			System.out.println(message.name);
		}
		
		//update element
		System.out.println(" ");
		System.out.println("Update element: ");
		if(hs.contains(pig)) {
			hs.remove(pig);
			hs.add(sheep);
		}
		Iterator<Animal> it3 = hs.iterator();		
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