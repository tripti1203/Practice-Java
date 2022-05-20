import java.util.*;
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		ht.put(1,100);
		ht.put(2,400);
		ht.put(3,300);
		ht.put(4,600);
		ht.put(5,900);
		System.out.println(ht); //hash table doesn't maintains order of insertion
		System.out.println(ht.clone()); //returns shallow copy of the elements 
		System.out.println(ht.hashCode()); //calculated using formula
		System.out.println(ht.values());//returns just the values that are inserted
		System.out.println(ht.replace(1,1000));
		for(Map.Entry<Integer,Integer> me: ht.entrySet()) { //traversing
			System.out.println(me.getKey() +" : " + me.getValue());
		}
		System.out.println(ht.toString()); //returns in string format
		System.out.println(ht.elements()); //returns the enumeration of the values
		System.out.println(ht.entrySet()); //returns set view (elements) of the mapping 
		System.out.println(ht.get(5)); //returns the value of the specified key
		System.out.println(ht.getClass()); //returns the class
		System.out.println(ht.getOrDefault(3,770));//returns the value mapped in the given key regardless of putting any default elements
		System.out.println(ht.keys());//returns the enumeration of the keys
		System.out.println(ht.keySet());//returns keys in a set form []
		System.out.println(ht.put(4,170));//stores the value and returns the changed value
		System.out.println(ht.putIfAbsent(5, 3000)); //stored if the value is null if not returns the same elements
		System.out.println(ht);
		ht.clear(); //clears everything and displays just the braces{}
		System.out.println(ht);
	}

}
