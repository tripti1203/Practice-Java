import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("Tripti");
		link.addFirst("Hi");
		link.add(1,"how are you?");
		link.addLast("bye");
		Iterator<String> iterator = link.iterator();
		while(iterator.hasNext()) {
			System.out.println("INITIAL LIST : " + iterator.next());
		}
		link.removeLast();
		
			System.out.println("Edited List : " + link);
		for(String ele:link) {
			System.out.println(ele);
		}
	
	}

}
