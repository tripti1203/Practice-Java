import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("a",300);
		tm.put("b",500);
		tm.put("c",250);
		tm.put("d",120);
		System.out.println(tm);
		System.out.println(tm.firstEntry()); //displays first element
		System.out.println(tm.lastEntry());  // displays last element
		System.out.println(tm.headMap("c")); //displays elements greater than specified element
		System.out.println(tm.tailMap("c")); //displays elements less than specified element
		//returns the key which is equal or less or greater than the specified element 
		System.out.println(tm.ceilingKey("b"));
		System.out.println(tm.floorKey("d")); //returns the greatest key
		System.out.println(tm.hashCode()); //calculated by formula
		System.out.println(tm.higherKey("a")); //returns the lowest key strictly greater than the specified key
		System.out.println(tm.lowerKey("b")); // return the greatest key strictly less than the specified key 
		System.out.println(tm.size());
		System.out.println(tm.values());// returns just the values stored 
		System.out.println(tm.tailMap("b")); //returns Map from the given key
		System.out.println(tm.subMap("a", "c")); //returns map between the given key excluding the end key
		System.out.println(tm.navigableKeySet()); //returns just the keys
		System.out.println(tm.containsKey("e"));
		System.out.println(tm.containsValue(500));
		for(Map.Entry<String,Integer> me: tm.entrySet()) {
			System.out.println(me.getKey() +" : " + me.getValue());
		}
	}
}
