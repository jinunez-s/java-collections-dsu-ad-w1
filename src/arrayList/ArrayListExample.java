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
	public static void main(String[] args) {
		//Declaring the ArrayList with initial size n
		int n = 5;
		ArrayList<Integer> arrLi = new ArrayList<Integer>(n);
		
		//Appending new elements at the end of the list
		for(int i = 1; i <= n; i++)
			arrLi.add(i);
		
		System.out.println(arrLi);

	}

}
