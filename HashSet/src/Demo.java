import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Tripti");
		hs.add("ABC");
		hs.add("AAA");
		System.out.println(hs);
		hs.remove("Tripti");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(hs.size());
		System.out.println(hs.clone());
		System.out.println(hs.spliterator());
		boolean isEmpty = hs.isEmpty();
		System.out.println(isEmpty);
		//methods left----> clear() , isEmpty()
	}

}
