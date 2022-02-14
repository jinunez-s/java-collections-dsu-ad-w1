package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class Example {
	public static void main(String args[]) {

		Animal cat = new Animal("cat");
		Animal dog = new Animal("dog");
		Animal Horse = new Animal("horse");
		Animal bird = new Animal("macaw");
		Animal duck = new Animal("duck");
		Animal cow = new Animal("cow");
		
		ArrayList<Animal> animalList = new ArrayList<>();
		
		//Add elements
		animalList.add(cat);
		animalList.add(dog);
		animalList.add(Horse);
		animalList.add(bird);
		animalList.add(duck);
		
		//Iterating elements 
		System.out.println("--- Iterating with Iterator and While ---");
		Iterator<Animal> itr = animalList.iterator();
		
		while(itr.hasNext()) {
			Animal message = itr.next();
			System.out.println(message.name);
		}
		
		//remove elements
		animalList.remove(1);
		System.out.println("--- Iterating with Iterator and While ---");
		Iterator<Animal> itr2 = animalList.iterator();
		
		while(itr2.hasNext()) {
			Animal message = itr2.next();
			System.out.println(message.name);
		}
		
		//update elements
		animalList.set(3, cow);
		System.out.println("--- Iterating with Iterator and While ---");
		Iterator<Animal> itr3 = animalList.iterator();
		
		while(itr3.hasNext()) {
			Animal message = itr3.next();
			System.out.println(message.name);
		}
		
	}
}

class Animal{
	String name;
	
	Animal(String name){
		this.name = name;
	}
}


