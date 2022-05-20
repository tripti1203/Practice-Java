import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<String> arr = new ArrayList<String>();
	    arr.add("chair");
	    arr.add("table");
	    arr.add("piano");
	    arr.add("guitar");
	    System.out.println(arr.get(1));
	    arr.set(1,"harmonium");
		System.out.println(arr.get(1));
		System.out.println(arr.size());
    }
}
