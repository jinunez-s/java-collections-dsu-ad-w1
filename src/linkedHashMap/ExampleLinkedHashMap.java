package linkedHashMap;

import java.util.*;

public class ExampleLinkedHashMap {
	public static void main(String args[]) {
		Animal bird = new Animal("duck", 5);
		Animal pig  = new Animal("hog", 15);
		Animal horse = new Animal("mustang", 10);
		Animal dog =  new Animal("huskey", 2);
		Animal cow = new Animal("angus", 10);
		Animal sheep = new Animal("dorper", 10);
	
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		//Add elements
		lhm.put(bird.name, bird.id);
		lhm.put(pig.name, pig.id);
		lhm.put(horse.name, horse.id);
		lhm.put(dog.name, dog.id);
		lhm.put(cow.name, cow.id);
		System.out.println("Add elements ");
		//Iterate elements
		for(Map.Entry<String, Integer> set: lhm.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		//remove element
		System.out.println(" ");
		System.out.println("Remove element: " + bird.name);
		lhm.remove(bird.name);
		System.out.println(lhm);
		
		//Update element
		System.out.println(" ");
		System.out.println("Update element: " + horse.name);
		lhm.replace(horse.name, 25);
		System.out.println(lhm);
	}
}

class Animal{
	String name;
	int id;
	public Animal(String name, int id){
		this.name = name;
		this.id = id;
	}
}