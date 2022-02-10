/**
 * 
 */
package arrayList;

import java.util.ArrayList;

/**
 * @author river
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public class animals{
		String nombre;
		int id;
		
	}
	public static void main(String[] args) {
		
		//Declaring the ArrayList with initial size n
		int n = 5;
		
		ArrayList<Integer> arrLi = new ArrayList<Integer>(n);
		
		//Appending new elements at the end of the list
		for(int i = 1; i <= n; i++)
			arrLi.add(i);//add
		
		//Iterate the array
		interator(arrLi);
		
		//remove an element at the specified position in the list.
		arrLi.remove(4);
		interator(arrLi);
		
		//update the ArrayList
		arrLi.set(2, 15);
		arrLi.set(3, 16);
		interator(arrLi);
		
		
		
		
	}

	public static void interator(ArrayList<Integer> arrLi) {
		System.out.println(arrLi);
		
	}

}
