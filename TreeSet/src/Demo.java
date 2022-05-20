import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("AAA");
		ts.add("XXX");
		ts.add("DDD");
		ts.add("ZZZ");
		ts.add("YYY");
		System.out.println(ts);
		System.out.println(ts.size());
		
		ts.remove("YYY");
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ts.size());
		System.out.println(ts.spliterator());
		boolean isContain = ts.contains("DDD");
		System.out.println(isContain);
	}

}
