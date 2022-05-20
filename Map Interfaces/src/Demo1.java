import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"ABC");
		hm.put(2,"XYZ");
		hm.put(3,"EFG");
		hm.put(4,"LMP");
		System.out.println(hm);
		//removing element
		hm.remove(3);
		//traversing
		for(Map.Entry<Integer,String> me : hm.entrySet()) {	
			System.out.println(me.getKey()+" : " +me.getValue());
		}
		hm.replace(4, "Tripti"); //replace(key,new value)
		System.out.println(hm);
		hm.replace(1, "ABC", "Devansh"); //replace(key,old value,new value)
		System.out.println(hm);
		hm.keySet(); //same as putall
		System.out.println(hm);
		hm.putAll(hm);	//displays all element with key
		System.out.println(hm);
	}

}
