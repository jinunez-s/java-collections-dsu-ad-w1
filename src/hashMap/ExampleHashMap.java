package hashMap;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
	public static void main(String args[]) {
		Map<String, Integer> hMap = new HashMap();
		
		Animal bird = new Animal("duck", 5);
		Animal pig  = new Animal("hog", 2);
		Animal horse = new Animal("mustang", 10);
		Animal dog =  new Animal("huskey", 2);
		Animal cow = new Animal("angus", 10);
		Animal sheep = new Animal("dorper", 10);
		
		//Add elements to the hashMap
		System.out.println("Add elements:  ");
		hMap.put(bird.name, bird.id);
		hMap.put(pig.name, pig.id);
		hMap.put(horse.name, horse.id);
		hMap.put(dog.name, dog.id);
		hMap.put(cow.name, null);
		
		//Iterate Elements
		for(Map.Entry<String, Integer> set: hMap.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		//Remove Element
		System.out.println(" ");
		System.out.println("Remove elements:  ");
		hMap.remove(bird.name, bird.id);
		for(Map.Entry<String, Integer> set: hMap.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		
		//Update Element
		System.out.println(" ");
		System.out.println("Update elements:  ");
		hMap.replace(cow.name, 10);
		for(Map.Entry<String, Integer> set: hMap.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
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