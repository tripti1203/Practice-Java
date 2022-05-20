import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hello");
		arr.add("Good Morning");
		arr.add("Have a good day");
		arr.add(2,"Boom Boom");
		arr.add("Ting tong");
		System.out.println("INITIAL ARRAY : " + arr);
		arr.set(4,"Bye");
		System.out.println("EDITED ARRAY : " + arr);
		arr.remove(2);
		System.out.println("LAST EDITED : " + arr);
		
		for(String ele:arr) {
			System.out.println(ele);
		}
	}

}
