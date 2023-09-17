package algo;

import java.util.List;
import java.util.ListIterator;

/**
 * Handles multiplication of Integers.
 */
public class Multiplier {
	
	/**
	 * Construct a Multiplier.
	 */
	public Multiplier() {	}
	
	/**
	 * Multiplies the first element from the beginning with the first element from 
	 * the end, the second element from the beginning with the second element from 
	 * the end etc and returns the sum of all multiplications. 
	 * 
	 * @param numberList a List containing Integers
	 * @return the sum
	 */
	public long multiplySome(List<Integer> numberList) { // -> O(1)
		// Jag skapar en for loop där i ökar i så länge i är mindre än hälften av size
		// Sedan multipliceras i från numberList som är hälften av storleken av hela size med numberList((hela storleken på listan) - i - 1)
		//detta leder till att den multiplicerar elementen på det önskade sättet.
		long sum = 0; // -> O(1)
		for(int i = 0; i < (numberList.size() / 2); i++) { // -> O(n)
			sum += ((long) numberList.get(i) * numberList.get(numberList.size() - i - 1)); // -> O(1)
		}
		//TODO: Add implementation
			
		return sum;		// -> O(1)
	}	//O(1) + O(1) + n x O(1) + O(1) -> C1 + n x C2 -> n x C2 = O(n)
	/**
	 * Multiplies all elements in the List with all the other elements 
	 * and returns the sum of all multiplications.  
	 * 
	 * @param numberList a List containing Integers
	 * @return the sum
	 */
	public long multiplyAll(List<Integer> numberList) { // -> O(1)
		long sum = 0; // -> O(1)
		//Jag skapar en int n av numberList.size för enkelhetens skull.
		//Jag skapar en for loop med en nästlad for loop för att kunna multiplicera i med de andra element
		// k kommer alltid vara en indexplats framför i och det och kommer köras tills dess at den når sista index platsen
		//Jag multiplicerar i med k för att få fram de önskade värden
		int n = numberList.size(); // -> O(1)
		for (int i = 0; i < n; i++) {   // -> O(n)
			for (int k = (i+1); k < n; k++) {   // -> O(n)
				sum += (long) numberList.get(i) * numberList.get(k); // -> O(1)
			}
		}
		//TODO: Add implementation

		return sum;		// -> O(1)
	} //O(1) + O(1) + O(1) + n x n x O(1) + O(1) -> C1 + 2n + n^2 x C2 -> n^2 x C2 = O(n^2)
}