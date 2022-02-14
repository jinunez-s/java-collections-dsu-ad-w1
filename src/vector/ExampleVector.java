package vector;

import java.util.*;

public class ExampleVector {
	public static void main(String args[]) {
		Vector vList = new Vector();
		
		Animal dog = new Animal("huskey");
		Animal horse = new Animal("mustang");
		Animal bird = new Animal("duck");
		Animal sheep = new Animal("merino");
		Animal pig = new Animal("hog");
		Animal cow = new Animal("angus");
		
		//Add items to the list
		System.out.println("Add & Iterate elements ");
		vList.add(dog);
		vList.add(horse);
		vList.add(bird);
		vList.add(sheep);
		vList.add(pig);
		
		
		//Iterate
		Iterator <Animal> it = vList.iterator();
		System.out.println("The Vector values are: ");
		while(it.hasNext()) {
			Animal message = it.next();
			System.out.println(message.name);
		}
		
		//remove item
		System.out.println(" ");
		System.out.println("Remove & Iterate elements ");
		vList.removeElementAt(1);
		Iterator <Animal> it2 = vList.iterator();
		System.out.println("The Vector values are: ");
		while(it2.hasNext()) {
			Animal message = it2.next();
			System.out.println(message.name);
		}
		
		//update item
		System.out.println(" ");
		System.out.println("Update & Iterate elements ");
		vList.set(1, cow);
		Iterator <Animal> it3 = vList.iterator();
		System.out.println("The Vector values are: ");
		while(it3.hasNext()) {
			Animal message = it3.next();
			System.out.println(message.name);
		}
		
	}
}
class Animal{
	String name;
	public Animal(String name) {
		this.name = name;	}
}