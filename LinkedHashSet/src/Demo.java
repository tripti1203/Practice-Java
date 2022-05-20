import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		System.out.println(lhs);
		lhs.remove(300);
		for(Integer ele:lhs) {
			System.out.println(ele);
		}
		System.out.println(lhs.spliterator());
		System.out.println(lhs.clone());
		System.out.println(lhs.size());
		boolean isContain = lhs.contains(300);
		System.out.println(isContain);
//Methods left----> clear() , isEmpty()
	}

}
