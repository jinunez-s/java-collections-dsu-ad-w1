package hashTable;

import java.util.*;


public class ExampleHashTable {

	
	public static void main(String args[]) {
		Hashtable ht1 = new Hashtable();
		
		Animal bird = new Animal("macaw");
		Animal horse = new Animal("mustang");
		Animal duck = new Animal("pijije");
		Animal pig = new Animal("hog");
		Animal chiken = new Animal("chiken");
		
		Enumeration ud;
		String str;
		
		//Add items
		ht1.put(bird.name, 1);
		ht1.put(horse.name, 2);
		ht1.put(duck.name, 3);
		ht1.put(pig.name, 4);
		ht1.put(chiken.name, 5);
		System.out.println("Adding elements to the list");
		System.out.println(ht1);
		
		ud = ht1.keys();
		
		//Iterate the items
		System.out.println(" ");
		System.out.println("Iterate through the items");
		while(ud.hasMoreElements()) {
			str = (String) ud.nextElement();
			System.out.println(str + ": " + ht1.get(str));
		}

		//Remove items
		System.out.println(" ");
		System.out.println("Remove items of the list ");
		ht1.remove(chiken.name);
		ht1.remove(pig.name);
		System.out.println(ht1);
		
		//Update items
		System.out.println(" ");
		System.out.println("Update item of the list ");
		ht1.replace(duck.name, 6);
		System.out.println(ht1);
		
	}
}

class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
}

