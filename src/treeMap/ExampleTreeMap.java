package treeMap;

import java.util.*;

public class ExampleTreeMap {

	public static void main(String args[]) {
		
		Animal bird = new Animal("duck", 35);
		Animal pig  = new Animal("hog", 100);
		Animal horse = new Animal("mustang", 15);
		Animal dog =  new Animal("huskey", 2);
		Animal cow = new Animal("angus", 10);
		Animal sheep = new Animal("dorper", 10);
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		//Add element to treeMap
		tm.put(bird.name, bird.id);
		tm.put(pig.name, pig.id);
		tm.put(horse.name, horse.id);
		tm.put(dog.name, dog.id);
		tm.put(cow.name, cow.id);
		tm.put(sheep.name, sheep.id);
		System.out.println("Add element to TreeMap: ");
		//Iterate elements
		for(Map.Entry<String, Integer> set: tm.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		//Remove elements
		System.out.println(" ");
		System.out.println("Remove element: " + bird.name);
		tm.remove(bird.name);
		System.out.println(tm);
		//Update elements
		System.out.println(" ");
		System.out.println("Update element: " + sheep.name);
		tm.replace(sheep.name, 25);
		System.out.println(tm);
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