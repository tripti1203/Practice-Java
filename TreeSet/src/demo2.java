import java.util.*;
public class demo2 {

	public static void main(String[] args) {
		// TreeSet stores elements in ascending orders only
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(400);
		ts.add(900);
		ts.add(200);
		ts.add(500);
		ts.add(100);
		System.out.println(ts);
		for(Integer ele:ts) {
			System.out.println(ele);
		}
		System.out.println("Size is : " + ts.size());
		
		//using descending iterator method now it will be displayed in descending order
		
		Iterator itr = ts.descendingIterator();
		System.out.println("DESCENDING ORDER ----->");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Ceiling returns closest or nearest element of the specified element
		System.out.println("Using ceiling method---->");
		System.out.println(ts.ceiling(900)); 
		System.out.println(ts.ceiling(200));
		System.out.println(ts.ceiling(120));
		
		// descendingSet returns the elements in descending order but in a set format
		System.out.println(ts.descendingSet());
		
		//headSet returns group of elements which are greater or equals to the specified elements
		System.out.println(ts.headSet(300));
		
		// higher method returns the greatest elements of the specified elements
		System.out.println(ts.higher(600));
		
		//lower method returns the lowest elements of the specified elements
		System.out.println(ts.lower(550));
		
		//pollFirst return the first element
		System.out.println(ts.pollFirst());
		
		//pollLast elements return the last element
		System.out.println(ts.pollLast());
		
		//return elements between the given range where first and last elements are not included
		System.out.println(ts.subSet(100,1000));
	}

}
