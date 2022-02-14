package treeSet;

import java.util.*;

public class ExampleTreeSet {
	public static void main(String args[]) {
		
		TreeSet<String> setL = new TreeSet<>();
		
		Animal bird = new Animal("duck");
		Animal pig  = new Animal("hog");
		Animal horse = new Animal("mustang");
		Animal dog =  new Animal("huskey");
		Animal cow = new Animal("angus");
		Animal sheep = new Animal("dorper");
		Animal wolf = new Animal("wolf");
		
		setL.add(bird.name);
		setL.add(pig.name);
		setL.add(horse.name);
		setL.add(dog.name);
		setL.add(cow.name);
		System.out.println("Iterate through elements ");
		Iterator<String> it = setL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Remove
		System.out.println(" ");
		System.out.println("Remove element: ");
		setL.remove(bird.name);
		Iterator<String> it2 = setL.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//update Element
		System.out.println(" ");
		System.out.println("Update element: ");
		if(setL.contains(dog.name)) {
			setL.remove(dog.name);
			setL.add(wolf.name);
		}
		Iterator<String> it3 = setL.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}
class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
}