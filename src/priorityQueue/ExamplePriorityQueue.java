package priorityQueue;

import java.util.*;


public class ExamplePriorityQueue {
	public static void main(String args[]) {
	
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		Animal bird = new Animal(2);
		Animal pig  = new Animal(5);
		Animal horse = new Animal (6);
		Animal dog =  new Animal(8);
		Animal cow = new Animal(10);
		Animal sheep = new Animal(3);
		Animal wolf = new Animal(1);
		
		pq.add(cow.priority);
		pq.add(dog.priority);
		pq.add(horse.priority);
		pq.add(pig.priority);
		pq.add(sheep.priority);
		pq.add(wolf.priority);
		
		
		System.out.println(" ");
		System.out.println("Add and Iterate elements: ");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Remove element in pq
		System.out.println(" ");
		System.out.println("Remove and Iterate elements: ");
		pq.remove(pig.priority);
		Iterator<Integer> it2 = pq.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//update element in pq
		System.out.println(" ");
		System.out.println("Update element ");
		if(pq.contains(wolf.priority)) {
			pq.remove(wolf.priority);
			pq.add(2);
		}
		System.out.println(pq);
		
		
		
		
	}
}
class Animal{
	
	int priority;
	public Animal(int priority) {
		
		this.priority = priority;
	}
}