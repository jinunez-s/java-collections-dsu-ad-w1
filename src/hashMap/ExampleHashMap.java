package hashMap;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
	public static void main(String args[]) {
		Map<Animal, String> hMap = new HashMap();
		
		Animal bird = new Animal("duck");
		Animal pig  = new Animal("hog");
		Animal horse = new Animal("mustang");
		Animal dog =  new Animal("huskey");
		Animal cow = new Animal("angus");
		Animal sheep = new Animal("dorper");
		
		//Add elements to the hashMap
		
		hMap.put(bird, bird.name);
		hMap.put(pig, pig.name);
		hMap.put(horse, horse.name);
		hMap.put(dog, dog.name);
		
		for(Map.Entry<Animal, String> set: hMap.entrySet()) {
			
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		 
		
	}
}

class Animal{
	String name;
	int id;
	public Animal(String name){
		this.name = name;
	}
}