import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("a",300);
		lhm.put("b",500);
		lhm.put("c",150);
		lhm.put("d",100);
		System.out.println(lhm);
		for(Map.Entry<String,Integer> me: lhm.entrySet()) {
			System.out.println(me.getKey() +" : " +me.getValue());
		}
		//removeEldestEntry method left
	}

}
